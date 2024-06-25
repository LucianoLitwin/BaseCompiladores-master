package compiladores.tp;

public class Symbol {
    private String name;
    private Type type;
    private boolean initialized;
    private boolean used;


    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
        this.initialized=false;
        this.used=false;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}