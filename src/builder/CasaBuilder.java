package builder;

public class CasaBuilder {

    private int quartos;
    private int banheiros;
    private boolean garagem;
    private boolean piscina;

    public CasaBuilder setQuartos(int quartos) {
        this.quartos = quartos;
        return this;
    }

    public CasaBuilder setBanheiros(int banheiros) {
        this.banheiros = banheiros;
        return this;
    }

    public CasaBuilder setGaragem(boolean garagem) {
        this.garagem = garagem;
        return this;
    }

    public CasaBuilder setPiscina(boolean piscina) {
        this.piscina = piscina;
        return this;
    }

    // Métodos getters
    public int getQuartos() {
        return quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public boolean hasGaragem() {
        return garagem;
    }

    public boolean hasPiscina() {
        return piscina;
    }

    // Método build
    public Casa build() {
        return Casa.construir(this);
    }
}
