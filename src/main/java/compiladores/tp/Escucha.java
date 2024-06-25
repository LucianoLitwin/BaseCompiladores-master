package compiladores.tp;

import compiladores.compiladoresBaseListener;
import compiladores.compiladoresParser;

import java.util.*;


public class Escucha extends compiladoresBaseListener {
    private SymbolTable symbolTable = new SymbolTable();

    private List<String> errors;      // Lista de errores sintácticos y semánticos
    private List<String> semanticWarnings; // Lista de advertencias semánticas

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

        Type type = null;
        String name;
        if(ctx.NOMBRE()!=null){
            // Método invocado al entrar a una declaración de variable
            type = Type.valueOf(ctx.tipo().getText().toUpperCase());  // Obtiene el tipo de la variable
            name = ctx.NOMBRE().getText();  // Obtiene el nombre de la variable no esta inicializado
        }else{
            // Método invocado al entrar a una declaración de variable
            type = Type.valueOf(ctx.tipo().getText().toUpperCase());  // Obtiene el tipo de la variable
            name = ctx.asignacion().NOMBRE().getText();  // Obtiene el nombre en base a asignacion porque significa que se inicializo

        }
        Symbol symbol= new Symbol(name,type);
        if(symbolTable.buscarSymbol(symbol)== null) {
            try {
                symbolTable.addSymbol(symbol);  // Agrega el símbolo a la tabla de símbolos
            } catch (Exception e) {
                errors.add(e.getMessage());  // Captura y agrega mensajes de error a la lista de errores
            }
        }else{
            System.out.println("Variable declarada dos veces");
        }


    }

    @Override
    public void exitAsignacion(compiladoresParser.AsignacionContext ctx) {


        // Método invocado al entrar a una asignación de variable
        if(ctx.NOMBRE()!=null) {
            String name = ctx.NOMBRE().getText();  // Obtiene el nombre de la variable
            Type type = symbolTable.getTypeByName(name);


            if (type != null) {
                Symbol symbol = new Symbol(name, type);
                try {
                    if (symbolTable.buscarSymbol(symbol) != null) {
                        symbolTable.initializeSymbol(symbol);  // Inicializa el símbolo en la tabla de símbolos
                    } else {
                        errors.add("Error semántico: Uso de un identificador no declarado " + name);
                        // Agrega un error si se intenta usar un identificador no declarado
                    }
                } catch (Exception e) {
                    errors.add(e.getMessage());  // Captura y agrega mensajes de error a la lista de errores
                }
            }
        }
    }

    @Override
    public void exitMyIf(compiladoresParser.MyIfContext ctx){
        if(ctx.condicion().NOMBRE() != null) {
            String name = ctx.condicion().NOMBRE().toString();
            Type type = symbolTable.getTypeByName(name);
            Symbol symbol = new Symbol(name, type);

            if(symbolTable.buscarSymbol(symbol) == null) {
                System.out.println("Comparando una variable inexistente");
            }else if(!symbolTable.buscarSymbol(symbol).isInitialized()){
                System.out.println("Comparando una variable no inicializada");
            }else{
                symbolTable.usedSymbol(symbol);
            }
        }

        if(ctx.PI()==null){
            errors.add("Error sintáctico, no hay parantesis de apertura en el if. ");
        }

        if(ctx.PD()==null){
            errors.add("Error sintáctico, no hay parantesis de cierre en el if. ");
        }
    }

    @Override
    public void exitMyFor(compiladoresParser.MyForContext ctx){
        if(ctx.PI()==null){
            errors.add("Error sintáctico, no hay parantesis de apertura en el for. ");
        }

        if(ctx.PD()==null){
            errors.add("Error sintáctico, no hay parantesis de cierre en el for. ");
        }
    }

    @Override
    public void exitMyWhile(compiladoresParser.MyWhileContext ctx){
        if(ctx.PI()==null){
            errors.add("Error sintáctico, no hay parantesis de apertura en el while. ");
        }

        if(ctx.PD()==null){
            errors.add("Error sintáctico, no hay parantesis de cierre en el while. ");
        }
    }

    @Override
    public void exitPrograma(compiladoresParser.ProgramaContext ctx) {
        Set<Symbol> allIdentificadores = new HashSet<>();
        for (Contexto contexto : symbolTable.getContexts()) {
            allIdentificadores.addAll(contexto.getSymbol().values());
        }

        // Verificar si han sido utilizados
        for (Symbol symbol : allIdentificadores) {
            if (!symbol.isUsed()) {
                System.out.println("Warning semántico: El identificador " + symbol.getName() + " de tipo " + symbol.getType() + " ha sido declarado pero no utilizado.");
            }
        }

        symbolTable.delContexto();
    }







}
