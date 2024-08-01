package compiladores.tp;

import compiladores.compiladoresBaseVisitor;
import compiladores.compiladoresParser;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends compiladoresBaseVisitor<Void> {
    private int tempCount = 0;
    private int labelCount = 0;
    private List<String> code = new ArrayList<>();
    private String currentTemp;

    private String newTemp() {
        return "t" + (tempCount++);
    }

    private String newLabel() {
        return "L" + (labelCount++);
    }

    public List<String> getCode() {
        return code;
    }

    @Override
    public Void visitDeclaracion(compiladoresParser.DeclaracionContext ctx) {
        // Declaraciones no necesitan código intermedio por ahora
        return null;
    }

    @Override
    public Void visitAsignacion(compiladoresParser.AsignacionContext ctx) {
        String varName = ctx.NOMBRE().getText();
        visit(ctx.expresion());
        String expr = currentTemp;
        code.add(varName + " = " + expr);
        return null;
    }

    @Override
    public Void visitMyIf(compiladoresParser.MyIfContext ctx) {
        visit(ctx.condicion());
        String cond = currentTemp;
        String labelTrue = newLabel();
        String labelEnd = newLabel();
        code.add("if " + cond + " goto " + labelTrue);
        visit(ctx.llaves(0)); // Bloque de código del if
        code.add("goto " + labelEnd);
        code.add(labelTrue + ":");
        if (ctx.ELSE() != null) {
            visit(ctx.llaves(1)); // Bloque de código del else
        }
        code.add(labelEnd + ":");
        return null;
    }

    @Override
    public Void visitMyFor(compiladoresParser.MyForContext ctx) {
        visit(ctx.expresionFor().asignacion());
        String init = currentTemp;
        visit(ctx.expresionFor().condicion());
        String cond = currentTemp;
        String iter = ctx.expresionFor().NOMBRE().getText() + ctx.expresionFor().ACUM().getText();
        String labelStart = newLabel();
        String labelEnd = newLabel();
        code.add(init);
        code.add(labelStart + ":");
        code.add("if " + cond + " goto " + labelEnd);
        visit(ctx.llaves());
        code.add(iter);
        code.add("goto " + labelStart);
        code.add(labelEnd + ":");
        return null;
    }

    @Override
    public Void visitMyWhile(compiladoresParser.MyWhileContext ctx) {
        visit(ctx.condicion());
        String cond = currentTemp;
        String labelStart = newLabel();
        String labelEnd = newLabel();
        code.add(labelStart + ":");
        code.add("if " + cond + " goto " + labelEnd);
        visit(ctx.llaves());
        code.add("goto " + labelStart);
        code.add(labelEnd + ":");
        return null;
    }

    @Override
    public Void visitExpresion(compiladoresParser.ExpresionContext ctx) {
        visit(ctx.termino());
        String left = currentTemp;
        visit(ctx.expresion_continua());
        String right = currentTemp;
        if (ctx.expresion_continua().MAS() != null) {
            String temp = newTemp();
            code.add(temp + " = " + left + " + " + right);
            currentTemp = temp;
        } else if (ctx.expresion_continua().MENOS() != null) {
            String temp = newTemp();
            code.add(temp + " = " + left + " - " + right);
            currentTemp = temp;
        }
        return null;
    }

    @Override
    public Void visitTermino(compiladoresParser.TerminoContext ctx) {
        visit(ctx.factor());
        String left = currentTemp;
        visit(ctx.termino_continua());
        String right = currentTemp;
        if (ctx.termino_continua().MULTI() != null) {
            String temp = newTemp();
            code.add(temp + " = " + left + " * " + right);
            currentTemp = temp;
        } else if (ctx.termino_continua().DIVI() != null) {
            String temp = newTemp();
            code.add(temp + " = " + left + " / " + right);
            currentTemp = temp;
        }
        return null;
    }

    @Override
    public Void visitFactor(compiladoresParser.FactorContext ctx) {
        if (ctx.NOMBRE() != null) {
            currentTemp = ctx.NOMBRE().getText();
        } else if (ctx.NUMERO() != null) {
            currentTemp = ctx.NUMERO().getText();
        } else if (ctx.llamadaFuncion() != null) {
            visit(ctx.llamadaFuncion());
        } else {
            visit(ctx.expresion());
        }
        return null;
    }

    @Override
    public Void visitCondicion(compiladoresParser.CondicionContext ctx) {
        String left;
        if (ctx.NOMBRE() != null) {
            left = ctx.NOMBRE().getText();
        } else if (ctx.NUMERO() != null) {
            left = ctx.NUMERO().getText();
        } else if (ctx.llamadaFuncion() != null) {
            visit(ctx.llamadaFuncion());
            left = currentTemp;
        } else {
            left = "";
        }

        if (ctx.condicion_continua().COMPARE() != null) {
            String op = ctx.condicion_continua().COMPARE().getText();
            String right;
            if (ctx.condicion_continua().NOMBRE() != null) {
                right = ctx.condicion_continua().NOMBRE().getText();
            } else if (ctx.condicion_continua().NUMERO() != null) {
                right = ctx.condicion_continua().NUMERO().getText();
            } else if (ctx.condicion_continua().llamadaFuncion() != null) {
                visit(ctx.condicion_continua().llamadaFuncion());
                right = currentTemp;
            } else {
                right = "";
            }
            currentTemp = left + " " + op + " " + right;
        }
        return null;
    }
}
