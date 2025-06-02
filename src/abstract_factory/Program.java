package abstract_factory;

public class Program {
    public static void main(String[] args) {

        // Entrega simples
        FabricaEntrega fabricaSimples = new FabricaEntregaSimples();
        ServicoEntrega entregaSimples = new ServicoEntrega(fabricaSimples);
        entregaSimples.processarEntrega();

        // Entrega premium
        FabricaEntrega fabricaPremium = new FabricaEntregaPremium();
        ServicoEntrega entregaPremium = new ServicoEntrega(fabricaPremium);
        entregaPremium.processarEntrega();
    }
}
