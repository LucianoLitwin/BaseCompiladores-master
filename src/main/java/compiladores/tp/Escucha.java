package compiladores.tp;

import compiladores.compiladoresBaseListener;
import compiladores.compiladoresParser;

import java.util.*;


public class Escucha extends compiladoresBaseListener {
    private SymbolTable symbolTable = new SymbolTable();

    private List<String> errors;      // Lista de errores sintácticos y semánticos
    private List<String> semanticWarnings; // Lista de advertencias semánticas
    private int permitoAsignar = 0;


    //para funciones
    private boolean insideFunction = false;
    private String currentFunctionName = null;

    public Escucha() {
        symbolTable = new SymbolTable();  // Inicialización de la tabla de símbolos
        errors = new ArrayList<>();       // Inicialización de la lista de errores
        semanticWarnings = new ArrayList<>(); // Inicialización de la lista de advertencias semánticas
    }

    @Override
    public void enterLlaves(compiladoresParser.LlavesContext ctx) {
        symbolTable.addContexto();
    }

    public List<String> getErrors() {
        return errors;  // Devuelve la lista de errores sintácticos y semánticos
    }


    public SymbolTable getSymbolTable() {
        return symbolTable;  // Devuelve la tabla de símbolos completa
    }


    @Override
    public void exitDeclaracion(compiladoresParser.DeclaracionContext ctx) {
        //System.out.println("ENTRO DECLARAR" + ctx.getText());
        Type type = Type.valueOf(ctx.tipo().getText().toUpperCase());
        String name = null;

        if (ctx.NOMBRE() != null) {
            name = ctx.NOMBRE().getText();
        } else if (ctx.asignacion() != null && ctx.asignacion().NOMBRE() != null) {
            name = ctx.asignacion().NOMBRE().getText();
            permitoAsignar = 1; // Marcar para permitir asignación en esta declaración
        }

        if (name != null) {
            Symbol symbol = new Symbol(name, type);

            if (symbolTable.buscarSymbol(symbol) == null) {
                symbolTable.addSymbol(symbol);

                if (ctx.asignacion() != null) {
                    permitoAsignar = 2; // Marcar que se está realizando la asignación
                    exitAsignacion(ctx.asignacion());
                }
            } else {
                String errorMsg = "Error de semántica: La variable " + name + " ya ha sido declarada.";
                errors.add(errorMsg);
                //System.out.println(errorMsg);
            }
        }
    }


    @Override
    public void exitAsignacion(compiladoresParser.AsignacionContext ctx) {

        String name = ctx.NOMBRE().getText();
        Type type = symbolTable.getTypeByName(name);
        //System.out.println("ENTRO ASIGNAR: "+permitoAsignar + ", NOMBRE: "+ ctx.NOMBRE().getText() +", Tipo: "+ type);
        if (permitoAsignar == 1 || permitoAsignar == 2) {
            // Permitir asignación porque hubo declaración previa


            if (type != null) {
                Symbol symbol = new Symbol(name, type);
                try {
                    if (symbolTable.buscarSymbol(symbol) != null) {
                        symbolTable.initializeSymbol(symbol);
                    } else {
                        errors.add("Error de semántica: Uso de un identificador no declarado " + name);
                    }
                } catch (Exception e) {
                    errors.add(e.getMessage());
                }
            } else {
                errors.add("Error de semántica: Uso de un identificador no declarado " + name);
            }
        }

        /*if(permitoAsignar == 0 && type == null){
            String errorMsg = "Error de semántica: La variable " + ctx.NOMBRE().getText() + " no ha sido declarada.";
            errors.add(errorMsg);
        }*/
        permitoAsignar=0;
    }


    @Override
    public void exitMyIf(compiladoresParser.MyIfContext ctx){
        //System.out.println("Exit If ctx: " + ctx.getText());
        if(ctx.condicion().NOMBRE() != null) {
            String name = ctx.condicion().NOMBRE().toString();
            Type type = symbolTable.getTypeByName(name);
            Symbol symbol = new Symbol(name, type);
            symbolTable.usedSymbol(symbol);
            if(symbolTable.buscarSymbol(symbol) == null) {
                errors.add("Error de semántica en IF: Comparando una variable inexistente");
            }else if(!symbolTable.buscarSymbol(symbol).isInitialized()){
                errors.add("Error de semántica en IF: Comparando una variable no inicializada");
            }
        }

    }

    @Override
    public void exitMyFor(compiladoresParser.MyForContext ctx){
        if(ctx.expresionFor().condicion().NOMBRE() != null) {
            String name = ctx.expresionFor().condicion().NOMBRE().toString();
            Type type = symbolTable.getTypeByName(name);
            Symbol symbol = new Symbol(name, type);
            symbolTable.usedSymbol(symbol);
            if(symbolTable.buscarSymbol(symbol) == null) {
                errors.add("Error de semántica en FOR: Comparando una variable inexistente");
            }else if(!symbolTable.buscarSymbol(symbol).isInitialized()){
                errors.add("Error de semántica en FOR: Comparando una variable no inicializada");
            }
        }
    }

    @Override
    public void exitMyWhile(compiladoresParser.MyWhileContext ctx){
        if(ctx.condicion().NOMBRE() != null) {
            String name = ctx.condicion().NOMBRE().toString();
            Type type = symbolTable.getTypeByName(name);
            Symbol symbol = new Symbol(name, type);
            symbolTable.usedSymbol(symbol);
            if(symbolTable.buscarSymbol(symbol) == null) {
                errors.add("Error de semántica en WHILE: Comparando una variable inexistente");
            }else if(!symbolTable.buscarSymbol(symbol).isInitialized()){
                errors.add("Error de semántica en WHILE: Comparando una variable no inicializada");
            }
        }
    }

    @Override
    public void enterDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx) {
        // Marca que estás dentro de una función
        insideFunction = true;
    }

    public void exitDeclaracionFuncion(compiladoresParser.DeclaracionFuncionContext ctx) {
        if (ctx.NOMBRE() != null && ctx.tipo() != null) {
            String functionName = ctx.NOMBRE().getText();
            Type returnType = Type.valueOf(ctx.tipo().getText().toUpperCase());
            currentFunctionName = functionName;

            /*// Para guardar los parametros
            List<Type> parameterTypes = new ArrayList<>();
            if (ctx.parametros() != null) {
                for (compiladoresParser.ParametrosContext paramCtx : ctx.parametros()) {
                    Type paramType = Type.valueOf(paramCtx.tipo().getText().toUpperCase());
                    parameterTypes.add(paramType);
                }
            }*/

            Function function = new Function(functionName, returnType, null);
            symbolTable.addSymbol(function);

        }
    }


    @Override
    public void exitMyReturn(compiladoresParser.MyReturnContext ctx) {
        Function function = symbolTable.getFunctionByName(currentFunctionName);
        Type typeFunction = function != null ? function.getType() : Type.VOID;
        Type typeReturn = Type.VOID;

        // Verifico el tipo de la expresión de retorno
        if (ctx.expresion().termino().factor().NUMERO() != null) {
            String numeroText = ctx.expresion().termino().factor().NUMERO().getText();
            if (numeroText.contains(".")) {
                typeReturn = Type.FLOAT;
            } else {
                typeReturn = Type.INT;
            }
        } else if (ctx.expresion().termino().factor().NOMBRE() != null) {
            typeReturn = Type.STRING;
        }

        // Verificar la presencia de la función y el tipo de retorno
        if (function == null) {
            //errors.add("Error: La función '" + currentFunctionName + "' no está declarada.");
        } else if ("VOID".equals(typeFunction.name()) && ctx.expresion() != null) {
            errors.add("Error: La función '" + currentFunctionName + "' es de tipo 'void' y no puede devolver un valor.");
        } else if (ctx.expresion() != null && !typeFunction.equals(typeReturn)) {
            errors.add("Error: La función '" + currentFunctionName + "' espera un valor de tipo '" + typeFunction.name() + "', pero se está retornando un valor de tipo '" + typeReturn.name() + "'.");
        }
    }


    @Override
    public void exitPrograma(compiladoresParser.ProgramaContext ctx) {
        Set<Symbol> allIdentificadores = new HashSet<>();
        for (Contexto contexto : symbolTable.getContexts()) {
            allIdentificadores.addAll(contexto.getSymbol().values());
        }

        // Verificar si los identificadores han sido utilizados
        for (Symbol symbol : allIdentificadores) {
            if (symbol instanceof Function) {
                continue; // Saltar las funciones
            }

            // Verificar si el identificador ha sido utilizado
            if (!symbol.isUsed()) {
                semanticWarnings.add("Advertencia semántica: El identificador " + symbol.getName() + " de tipo " + symbol.getType() + " no se utiliza.");
            }
        }

        symbolTable.delContexto();

        if(errors.toArray().length>0){
            for (String error : errors) {
                System.err.println("-" + error);
            }
        }

        if(semanticWarnings.toArray().length>0){
            final String ANSI_RESET = "\u001B[0m";
            final String ANSI_YELLOW = "\u001B[33m";
            for (String warning : semanticWarnings) {
                System.out.println(ANSI_YELLOW +"-" + warning+ANSI_RESET);
            }
        }
        symbolTable.delContexto();
    }
}
