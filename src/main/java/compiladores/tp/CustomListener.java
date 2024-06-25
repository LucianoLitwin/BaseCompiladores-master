package compiladores.tp;

import compiladores.compiladoresBaseListener;
import compiladores.compiladoresParser;
import org.antlr.v4.runtime.tree.ErrorNode;



import java.util.ArrayList;
import java.util.List;

public class CustomListener extends compiladoresBaseListener {
    private SymbolTable symbolTable;  // Tabla de símbolos para almacenar identificadores
    private List<String> errors;      // Lista de errores sintácticos y semánticos
    private List<String> semanticWarnings; // Lista de advertencias semánticas

    public CustomListener() {
        symbolTable = new SymbolTable();  // Inicialización de la tabla de símbolos
        errors = new ArrayList<>();       // Inicialización de la lista de errores
        semanticWarnings = new ArrayList<>(); // Inicialización de la lista de advertencias semánticas
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
    public void enterDeclaracion(compiladoresParser.DeclaracionContext ctx) {
        // Método invocado al entrar a una declaración de variable
        String type = ctx.getChild(0).getText();  // Obtiene el tipo de la variable
        String name = ctx.getChild(1).getText();  // Obtiene el nombre de la variable
        boolean initialized = ctx.getChildCount() > 2 && ctx.getChild(2).getText().equals("=");  // Verifica si está inicializada

        /*try {
            symbolTable.add(name, type, initialized);  // Agrega el símbolo a la tabla de símbolos
        } catch (Exception e) {
            errors.add(e.getMessage());  // Captura y agrega mensajes de error a la lista de errores
        }*/
    }

    @Override
    public void enterAsignacion(compiladoresParser.AsignacionContext ctx) {
        // Método invocado al entrar a una asignación de variable
        String name = ctx.getChild(0).getText();  // Obtiene el nombre de la variable a asignar

        /*try {
            if (!symbolTable.isDeclared(name)) {
                errors.add("Error semántico: Uso de un identificador no declarado " + name);
                // Agrega un error si se intenta usar un identificador no declarado
            } else {
                symbolTable.initializeSymbol(name);  // Inicializa el símbolo en la tabla de símbolos
            }
        } catch (Exception e) {
            errors.add(e.getMessage());  // Captura y agrega mensajes de error a la lista de errores
        }*/
    }

    // Método para verificar símbolos no utilizados
    public void checkUnusedSymbols() {

        // Verifica el bloque principal de código (asume que está en el contexto de la función 'main')
        // Marca como utilizados todos los identificadores declarados en la tabla de símbolos
        /*for (String name : symbolTable.getSymbols().keySet()) {
            Symbol symbol = symbolTable.getSymbols().get(name);
            if (!symbol.isInitialized()) {
                semanticWarnings.add("Advertencia semántica: Identificador declarado pero no usado: " + name);
            }
        }*/
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errors.add("Error sintáctico en: " + node.getText());  // Agrega errores sintácticos encontrados
    }
}
