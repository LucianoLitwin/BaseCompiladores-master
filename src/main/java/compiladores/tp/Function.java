package compiladores.tp;

import java.util.List;

public class Function extends Symbol{
    private List<Type> types;

    public Function(String name, Type type, List<Type> types) {
        super(name, type);
        this.types = types;
    }

    public List<Type> getTypes() {
        return types;
    }
}
