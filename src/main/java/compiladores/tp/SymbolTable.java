package compiladores.tp;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private List<Contexto> contextos;

    private SymbolTable symbolTable;  // Tabla de símbolos para almacenar identificadores
    private List<String> errors;      // Lista de errores sintácticos y semánticos
    private List<String> semanticWarnings; // Lista de advertencias semánticas

    public SymbolTable() {
        this.contextos = new ArrayList<>();
        this.contextos.add(new Contexto());
    }

    public void addContexto() {
        contextos.add(new Contexto());
    }

    public void delContexto() {
        if (contextos.size() > 1) {
            contextos.remove(contextos.size() - 1);
        }
    }

    public void addSymbol(Symbol symbol) {
        contextos.get(contextos.size() - 1).addSymbol(symbol);
    }

    public Symbol buscarSymbol(Symbol mySymbol) {
        for (int i = contextos.size() - 1; i >= 0; i--) {
            Symbol symbol = contextos.get(i).buscarSymbol(mySymbol);
            if (symbol != null) {
                return symbol;
            }
        }
        return null;
    }

    public void initializeSymbol(Symbol symbol) {
        for (int i = contextos.size(); i >=0 ; i--) {
            symbol.setInitialized(true);
        }
    }

    public void usedSymbol(Symbol symbol) {
        for (int i = contextos.size(); i >=0 ; i--) {
            symbol.setUsed(true);
        }
    }

    public Type getTypeByName(String name){
        Symbol symbol = new Symbol(name, null);
        for (int i = contextos.size() - 1; i >=0 ; i--) {
            Symbol symbol1 = contextos.get(i).buscarSymbol(symbol);
            if (symbol1 != null) {
                return symbol1.getType();
            }
        }
        return null;
    }

    public List<Contexto> getContexts() {
        return contextos;
    }
}








