package compiladores.tp;

import compiladores.compiladoresLexer;
import compiladores.compiladoresParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.*;
import java.io.File;
import java.util.Arrays;
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

        // Visualizar el árbol sintáctico
        showParseTreeFrame(parser, tree);

        // Generar el código de tres direcciones
        Visitor visitor = new Visitor();
        visitor.visit(tree);

        // Obtener el código de tres direcciones
        List<String> code = visitor.getCode();

        // Optimizar el código de tres direcciones
        Optimizer optimizer = new Optimizer(code);
        List<String> optimizedCode = optimizer.optimize();

        // Imprimir el código de tres direcciones
        System.out.println("\nCódigo de tres direcciones:");
        for (String instruction : code) {
            System.out.println(instruction);
        }

        // Imprimir el código de tres direcciones optimizado
        System.out.println("\nCódigo de tres direcciones optimizado:");
        for (String instruction : optimizedCode) {
            System.out.println(instruction);
        }

        // Crear el directorio de salida si no existe
        File outputDir = new File("output");
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        // Guardar los resultados en archivos
        saveToFile("output/symbol_table.txt", visitor.getSymbolTable().toString());
        saveToFile("output/three_address_code.txt", code);
        saveToFile("output/optimized_code.txt", optimizedCode);
    }

    private static void saveToFile(String filename, List<String> content) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String line : content) {
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showParseTreeFrame(compiladoresParser parser, ParseTree tree) {
        // Crear un JFrame para mostrar el árbol sintáctico
        JFrame frame = new JFrame("Árbol Sintáctico");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.5); // Escalar el árbol para mejor visualización
        panel.add(viewer);

        // Agregar el panel al JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Configurar el JFrame
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

}
