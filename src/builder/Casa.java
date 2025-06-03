package builder;

public class Casa {

    private int quartos;
    private int banheiros;
    private boolean garagem;
    private boolean piscina;

    // Construtor privado para forçar uso do Builder
    private Casa(CasaBuilder builder) {
        this.quartos = builder.getQuartos();
        this.banheiros = builder.getBanheiros();
        this.garagem = builder.hasGaragem();
        this.piscina = builder.hasPiscina();
    }

    @Override
    public String toString() {
        return "Casa com " + quartos + " quartos, " + banheiros + " banheiros, "
                + (garagem ? "com garagem" : "sem garagem") + ", "
                + (piscina ? "com piscina" : "sem piscina");
    }

    // Fábrica de instância através do builder
    public static Casa construir(CasaBuilder builder) {
        return new Casa(builder);
    }
}
