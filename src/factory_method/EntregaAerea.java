package factory_method;

public class EntregaAerea extends ServicoEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Drone();
    }
}
