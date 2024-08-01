package compiladores.tp;

public enum Type {
    VOID,
    INT,
    DOUBLE,
    FLOAT,
    STRING,
    CHAR;

    // Método para obtener un TipoDato a partir de un string, insensible a mayúsculas y minúsculas.
    public static Type fromString(String tipo) {
        if (tipo != null) {
            for (Type t : Type.values()) {
                if (t.name().equalsIgnoreCase(tipo)) {
                    return t;
                }
            }
        }
        throw new IllegalArgumentException("NO ENCUENTRA EL TIPO DE DATO " + tipo);
    }
}