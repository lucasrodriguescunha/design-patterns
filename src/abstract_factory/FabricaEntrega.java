package abstract_factory;

public interface FabricaEntrega {

    Transporte criarTransporte();
    Embalagem criarEmbalagem();
}
