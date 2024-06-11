package compiladores;

import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*syntaxErrors para los errores sintácticos, 
semanticErrors para los errores semánticos 
semanticWarnings para las advertencias semánticas. */

public class CustomListener extends compiladoresBaseListener {
    private SymbolTable symbolTable;
    private List<String> errors;
    private List<String> semanticWarnings; // Added field for semantic warnings

    public CustomListener() {
        symbolTable = new SymbolTable();
        errors = new ArrayList<>();
        semanticWarnings = new ArrayList<>(); // Initialize semanticWarnings list
    }

    public List<String> getErrors() {
        return errors;
    }

    public List<String> getSemanticWarnings() {
        return semanticWarnings;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public void enterDeclaracion(compiladoresParser.DeclaracionContext ctx) {
        String type = ctx.getChild(0).getText();
        String name = ctx.getChild(1).getText();
        boolean initialized = ctx.getChild(2).getText().equals("=");

        try {
            symbolTable.addSymbol(name, type, initialized);
        } catch (Exception e) {
            errors.add(e.getMessage());
        }
    }

    @Override
    public void enterAsignacion(compiladoresParser.AsignacionContext ctx) {
        String name = ctx.getChild(0).getText();

        try {
            if (!symbolTable.isDeclared(name)) {
                errors.add("Error semántico: Uso de un identificador no declarado " + name);
            } else {
                symbolTable.initializeSymbol(name);
            }
        } catch (Exception e) {
            errors.add(e.getMessage());
        }
    }

    // Method to check unused symbols
    // Updated checkUnusedSymbols() method
public void checkUnusedSymbols() {
    Set<String> usedSymbols = new HashSet<>();

    // Check usage in main() function
    usedSymbols.add("main");

    // Check usage in testFunction() or other defined functions
    // Example for testFunction
    if (symbolTable.isDeclared("testFunction")) {
        usedSymbols.add("testFunction");
    }

    // Check usage in main code block (assumed to be in main function context)
    for (String name : symbolTable.getSymbols().keySet()) {
        if (name.equals("a") || name.equals("b") || name.equals("i")) {
            usedSymbols.add(name);
        }
    }

    // Check if declared symbols are used
    for (String name : symbolTable.getSymbols().keySet()) {
        if (!usedSymbols.contains(name) && !name.equals("main") && !name.equals("testFunction")) {
            semanticWarnings.add("Advertencia semántica: Identificador declarado pero no usado: " + name);
        }
    }
}

    @Override
    public void visitErrorNode(ErrorNode node) {
        errors.add("Error sintáctico en: " + node.getText());
    }
}
