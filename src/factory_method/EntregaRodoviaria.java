package factory_method;

public class EntregaRodoviaria extends ServicoEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}