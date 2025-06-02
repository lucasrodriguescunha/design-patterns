package Factory_Method;

public abstract class ServicoEntrega {

    // Factory Method
    public abstract Transporte criarTransporte();

    // Método que utiliza o transporte criado
    public void realizarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
