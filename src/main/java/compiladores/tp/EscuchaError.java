package compiladores.tp;

import compiladores.compiladoresBaseListener;
import org.antlr.v4.parse.GrammarTreeVisitor.tokenSpec_return;
import org.antlr.v4.runtime.*;

public class EscuchaError extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException
        e) {
            String errorMsg = msg;
            String detailedMsg;

            switch (tipoError(msg)) {
                case ")":
                    detailedMsg = "Error de sintaxis: Se esperaba un paréntesis de cierre.";
                    break;
                case "(":
                    detailedMsg = "Error de sintaxis: Se esperaba un paréntesis de apertura.";
                    break;
                case ";":
                    detailedMsg = "Error de sintaxis: Se esperaba un punto y coma.";
                    break;
                case "{":
                    detailedMsg = "Error de sintaxis: Se esperaba una llave de apertura.";
                    break;
                case "}":
                    detailedMsg = "Error de sintaxis: Se esperaba una llave de cierre.";
                    break;
                case "otro":
                    detailedMsg = "Error de sintaxis: Entrada no reconocida " + recognizer.getVocabulary().getDisplayName(((Token) offendingSymbol).getType());
                    break;
                case "/0":
                    detailedMsg = "Error aritmético: División por cero en la línea " + line;
                    break;
                default:
                    detailedMsg = errorMsg;
                    break;
            }

            System.err.println(detailedMsg + " En la línea: " + line + ":" + charPositionInLine);
        }

        private String tipoError(String msg) {
            if (msg.contains("')'")) {
                return ")";
            } else if (msg.contains("'('")) {
                return "(";
            } else if (msg.contains("';'")) {
                return ";";
            } else if (msg.contains("'{'")) {
                return "{";
            } else if (msg.contains("'}'")) {
                return "}";
            } else if (msg.contains("no viable alternative at input")) {
                return "otro";
            }
            return "nada";
        }
    }

