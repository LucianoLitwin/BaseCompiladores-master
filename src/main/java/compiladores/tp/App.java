package compiladores.tp;

import compiladores.compiladoresLexer;
import compiladores.compiladoresParser;
import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {

        // Cargar el archivo de entrada
        System.out.println("\nHola Profe! :)\n");

        CharStream input = CharStreams.fromFileName("input/programa.txt");

        compiladoresLexer lexer = new compiladoresLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        compiladoresParser parser = new compiladoresParser(tokens);

        Escucha escucha = new Escucha();
        parser.addParseListener(escucha);

        // Añadir un listener para errores sintácticos
        parser.removeErrorListeners();
        EscuchaError errorEscucha = new EscuchaError();
        parser.addErrorListener(errorEscucha);
        parser.programa();
    }
}

