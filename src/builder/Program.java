package builder;

public class Program {
    public static void main(String[] args) {

        Casa casaSimples = new CasaBuilder()
                .setQuartos(2)
                .setBanheiros(1)
                .setGaragem(false)
                .setPiscina(false)
                .build();

        Casa casaLuxo = new CasaBuilder()
                .setQuartos(5)
                .setBanheiros(4)
                .setGaragem(true)
                .setPiscina(true)
                .build();

        System.out.println(casaSimples);
        System.out.println(casaLuxo);
    }
}
