package compiladores.tp;

import java.util.HashMap;
import java.util.Map;

class Contexto {
    private Map<String, Symbol> symbols;

    public Contexto() {
        this.symbols = new HashMap<>();
    }

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol buscarSymbol(Symbol mySymbol) {
        for (Symbol symbol : symbols.values()) {
            if (symbol.getName().equals(mySymbol.getName())) {
                return symbol;
            }
        }
        return null;
    }

    public Symbol buscarNameSymbol(String name){
        for (Symbol symbol : symbols.values()) {
            if(symbol.getName().equals(name)){
                return symbol;
            }
        }
        return null;
    }



    public Map<String, Symbol> getSymbol() {
        return symbols;
    }
}