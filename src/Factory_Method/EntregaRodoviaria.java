package Factory_Method;

public class EntregaRodoviaria extends ServicoEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}