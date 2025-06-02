package Factory_Method;

public class EntregaAerea extends ServicoEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Drone();
    }
}
