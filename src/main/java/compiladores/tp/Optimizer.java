package compiladores.tp;
import java.util.*;

public class Optimizer {
    private List<String> code;
    private Map<String, String> constants;
    private Set<String> computedExpressions;

    public Optimizer(List<String> code) {
        this.code = new ArrayList<>(code);
        this.constants = new HashMap<>();
        this.computedExpressions = new HashSet<>();
    }

    public List<String> optimize() {
        propagateConstants();
        eliminateRedundantOperations();
        return code;
    }

    private void propagateConstants() {
        List<String> optimizedCode = new ArrayList<>();
        for (String instruction : code) {
            String[] parts = instruction.split(" = ");
            if (parts.length == 2) {
                String left = parts[0].trim();
                String right = parts[1].trim();

                // Si la parte derecha es una constante, la guardamos
                if (isConstant(right)) {
                    constants.put(left, right);
                } else {
                    // Reemplazamos las variables por sus valores constantes
                    for (Map.Entry<String, String> entry : constants.entrySet()) {
                        right = right.replace(entry.getKey(), entry.getValue());
                    }
                    optimizedCode.add(left + " = " + right);
                }
            } else {
                // Reemplazamos las variables por sus valores constantes en las instrucciones de salto
                for (Map.Entry<String, String> entry : constants.entrySet()) {
                    instruction = instruction.replace(entry.getKey(), entry.getValue());
                }
                optimizedCode.add(instruction);
            }
        }
        code = optimizedCode;
    }

    private boolean isConstant(String value) {
        return value.matches("-?\\d+(\\.\\d+)?"); // Número entero o decimal
    }

    private void eliminateRedundantOperations() {
        List<String> optimizedCode = new ArrayList<>();
        for (String instruction : code) {
            if (computedExpressions.contains(instruction)) {
                continue; // Eliminamos la operación repetida
            }
            optimizedCode.add(instruction);
            computedExpressions.add(instruction);
        }
        code = optimizedCode;
    }
}
