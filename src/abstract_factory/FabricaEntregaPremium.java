package abstract_factory;

public class FabricaEntregaPremium implements FabricaEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Drone();
    }

    @Override
    public Embalagem criarEmbalagem() {
        return new CaixaTermica();
    }
}
