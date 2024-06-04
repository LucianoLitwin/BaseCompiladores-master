package compiladores;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

public class CustomListener extends compiladoresBaseListener {
    private SymbolTable symbolTable;
    private List<String> errors;

    public CustomListener() {
        symbolTable = new SymbolTable();
        errors = new ArrayList<>();
    }

    public List<String> getErrors() {
        return errors;
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

    // Otros métodos para if, for, while, etc. según las reglas de la gramática

    @Override
    public void visitErrorNode(ErrorNode node) {
        errors.add("Error sintáctico en: " + node.getText());
    }
}
