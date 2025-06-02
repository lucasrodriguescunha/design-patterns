package Factory_Method;

public class EntregaUrbana extends ServicoEntrega {

    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}