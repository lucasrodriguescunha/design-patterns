package flyweight;

class Character {

    private final String symbol; // Estado extrínseco
    private final int linha;
    private final int coluna;
    private final FontStyle estilo;

    public Character(String symbol, int linha, int coluna, FontStyle estilo) {
        this.symbol = symbol;
        this.linha = linha;
        this.coluna = coluna;
        this.estilo = estilo;
    }

    public void renderizar() {
        estilo.aplicar(symbol, linha, coluna);
    }
}
