package compiladores.tp;

import compiladores.compiladoresLexer;
import compiladores.compiladoresParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
        ParseTree tree = parser.programa();

        // Generar el código de tres direcciones
        Visitor visitor = new Visitor();
        visitor.visit(tree);

        // Imprimir el código generado
        System.out.println("\nCódigo de tres direcciones:");
        for (String instruction : visitor.getCode()) {
            System.out.println(instruction);
        }
    }
}
