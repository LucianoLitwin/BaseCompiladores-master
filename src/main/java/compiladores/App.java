package compiladores;

//import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

        
// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Compilador!!!");
        String inputFile = "input/entrada.txt";
        String content = new String(Files.readAllBytes(Paths.get(inputFile)));

        compiladoresLexer lexer = new compiladoresLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        compiladoresParser parser = new compiladoresParser(tokens);
        ParseTree tree = parser.programa();

        CustomListener listener = new CustomListener();
        parser.addParseListener(listener);
        parser.programa();

        List<String> errors = listener.getErrors();
        if (errors.isEmpty()) {
            System.out.println("No se encontraron errores.");
        } else {
            for (String error : errors) {
                System.out.println(error);
            }
        }
        
    }
}
