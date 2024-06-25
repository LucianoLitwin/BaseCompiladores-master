package compiladores.tp;

import compiladores.compiladoresLexer;
import compiladores.compiladoresParser;
import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try {
            // Cargar el archivo de entrada
            System.out.println("Hola Profe! :)");
            String inputFile = "input/programa.txt";
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));
            
            // Crear el lexer y el parser
            compiladoresLexer lexer = new compiladoresLexer(CharStreams.fromString(content));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            compiladoresParser parser = new compiladoresParser(tokens);

            Escucha escucha = new Escucha();
            parser.addParseListener(escucha);
            
            // Añadir un listener para errores sintácticos
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    String errorMsg = "Línea " + line + ":" + charPositionInLine + " " + msg;
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
                        case "}":
                            detailedMsg = "Error de sintaxis: Se esperaba una llave de cierre.";
                            break;
                        case "otro":
                            detailedMsg = "Error de sintaxis: Entrada no reconocida " + recognizer.getVocabulary().getDisplayName(((Token) offendingSymbol).getType());
                            break;
                        default:
                            detailedMsg = errorMsg;
                            break;
                    }

                    System.out.println(detailedMsg + " En la línea: " + line + ":" + charPositionInLine);
                }

                private String tipoError(String msg) {
                    if (msg.contains("')'")) {
                        return ")";
                    } else if (msg.contains("'('")) {
                        return "(";
                    } else if (msg.contains("';'")) {
                        return ";";
                    } else if (msg.contains("'}'")) {
                        return "}";
                    } else if (msg.contains("no viable alternative at input")) {
                        return "otro";
                    }
                    return "nada";
                }
            });



            // Solicito al parser que comience indicando una regla gramatical
            // En este caso la regla es el simbolo inicial
            parser.programa();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
