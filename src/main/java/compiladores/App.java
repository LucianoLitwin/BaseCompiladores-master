package compiladores;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

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
            
            // Añadir un listener para errores sintácticos
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    System.err.printf("Error sintáctico en línea %d:%d - %s\n", line, charPositionInLine, msg);
                }
            });

            // Iniciar la compilación
            ParseTree tree = parser.programa();
            
            // Crear los listeners
            Escucha escucha = new Escucha();
            CustomListener customListener = new CustomListener();
            
            // Recorrer el árbol de derivación
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(escucha, tree);
            walker.walk(customListener, tree);
            
            // Imprimir la cantidad de nodos y hojas
            System.out.println(escucha.toString());
            
            // Imprimir la tabla de símbolos y errores semánticos si hay
            System.out.println("Tabla de Símbolos:");
            SymbolTable symbolTable = customListener.getSymbolTable();
            for (Map.Entry<String, Symbol> entry : symbolTable.getSymbols().entrySet()) {
                Symbol symbol = entry.getValue();
                System.out.printf("Identificador: %s, Tipo: %s, Inicializado: %s\n",
                        symbol.getName(), symbol.getType(), symbol.isInitialized());
            }

            List<String> errors = customListener.getErrors();
            if (!errors.isEmpty()) {
                System.out.println("Errores semánticos:");
                for (String error : errors) {
                    System.out.println(error);
                }
            } else {
                System.out.println("No se encontraron errores semánticos.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
