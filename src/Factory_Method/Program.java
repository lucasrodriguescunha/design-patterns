package Factory_Method;

public class Program {
    public static void main(String[] args) {

        ServicoEntrega entregaUrbana = new EntregaUrbana();
        entregaUrbana.realizarEntrega();  // Entrega realizada por Bicicleta.

        ServicoEntrega entregaRodoviaria = new EntregaRodoviaria();
        entregaRodoviaria.realizarEntrega();  // Entrega realizada por Caminhão.

        ServicoEntrega entregaAerea = new EntregaAerea();
        entregaAerea.realizarEntrega();  // Entrega realizada por Drone.
    }
}
