package compiladores.tp;

import compiladores.compiladoresBaseListener;
import compiladores.compiladoresParser;

import java.util.*;


public class Escucha extends compiladoresBaseListener {
    private SymbolTable symbolTable = new SymbolTable();

    private List<String> errors;      // Lista de errores sintácticos y semánticos
    private List<String> semanticWarnings; // Lista de advertencias semánticas
    private int permitoAsignar = 0;

    public Escucha() {
        symbolTable = new SymbolTable();  // Inicialización de la tabla de símbolos
        errors = new ArrayList<>();       // Inicialización de la lista de errores
        semanticWarnings = new ArrayList<>(); // Inicialización de la lista de advertencias semánticas
    }

    @Override
    public void enterLlaves(compiladoresParser.LlavesContext ctx) {
        symbolTable.addContexto();
    }

    @Override
    public void exitLlaves(compiladoresParser.LlavesContext ctx) {
        symbolTable.delContexto();
    }

    public List<String> getErrors() {
        return errors;  // Devuelve la lista de errores sintácticos y semánticos
    }

    public List<String> getSemanticWarnings() {
        return semanticWarnings;  // Devuelve la lista de advertencias semánticas
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

            if(symbolTable.buscarSymbol(symbol) == null) {
                errors.add("Error de semántica en IF: Comparando una variable inexistente");
            }else if(!symbolTable.buscarSymbol(symbol).isInitialized()){
                errors.add("Error de semántica en IF: Comparando una variable no inicializada");
            }else{
                symbolTable.usedSymbol(symbol);
            }
        }

    }

    @Override
    public void exitMyFor(compiladoresParser.MyForContext ctx){
        if(ctx.expresionFor().condicion().NOMBRE() != null) {
            String name = ctx.expresionFor().condicion().NOMBRE().toString();
            Type type = symbolTable.getTypeByName(name);
            Symbol symbol = new Symbol(name, type);

            if(symbolTable.buscarSymbol(symbol) == null) {
                errors.add("Error de semántica en FOR: Comparando una variable inexistente");
            }else if(!symbolTable.buscarSymbol(symbol).isInitialized()){
                errors.add("Error de semántica en FOR: Comparando una variable no inicializada");
            }else{
                symbolTable.usedSymbol(symbol);
            }
        }
    }

    @Override
    public void exitMyWhile(compiladoresParser.MyWhileContext ctx){
        if(ctx.condicion().NOMBRE() != null) {
            String name = ctx.condicion().NOMBRE().toString();
            Type type = symbolTable.getTypeByName(name);
            Symbol symbol = new Symbol(name, type);

            if(symbolTable.buscarSymbol(symbol) == null) {
                errors.add("Error de semántica en WHILE: Comparando una variable inexistente");
            }else if(!symbolTable.buscarSymbol(symbol).isInitialized()){
                errors.add("Error de semántica en WHILE: Comparando una variable no inicializada");
            }else{
                symbolTable.usedSymbol(symbol);
            }
        }
    }

    /*@Override
    public void exitExpresionAritmetica(compiladoresParser.ExpresionAritmeticaContext ctx) {
        // Ejemplo de verificación de división por cero
        if (ctx.operador.getText().equals("/") && ctx.right.getText().equals("0")) {
            errors.add("Error aritmético: División por cero en la línea " + ctx.start.getLine());
        }
    }*/

    @Override
    public void exitPrograma(compiladoresParser.ProgramaContext ctx) {
        Set<Symbol> allIdentificadores = new HashSet<>();
        for (Contexto contexto : symbolTable.getContexts()) {
            allIdentificadores.addAll(contexto.getSymbol().values());
        }

        // Verificar si han sido utilizados
        for (Symbol symbol : allIdentificadores) {
            //System.out.println("Name id: " + symbol.getName());

            if (!symbol.isUsed()) {
                //System.out.println("Advertencia semántica: El identificador " + symbol.getName() + " de tipo " + symbol.getType() + " nose utiliza.");
                semanticWarnings.add("Advertencia semántica: El identificador " + symbol.getName() + " de tipo " + symbol.getType() + " no se utiliza.");
            }
        }


        if(errors.toArray().length>0){
            System.out.println("\nErrores de Semántica:");
            for (String error : errors) {
                System.out.println("-" + error);
            }
        }

        if(semanticWarnings.toArray().length>0){
            System.out.println("WARNINGS");
            for (String warning : semanticWarnings) {
                System.out.println("-" + warning);
            }
        }
        symbolTable.delContexto();
    }






}
