package factory_method;

public class EntregaUrbana extends ServicoEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}