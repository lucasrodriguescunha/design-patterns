package abstract_factory;

public class FabricaEntregaSimples implements FabricaEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }

    @Override
    public Embalagem criarEmbalagem() {
        return new CaixaPapel();
    }
}

