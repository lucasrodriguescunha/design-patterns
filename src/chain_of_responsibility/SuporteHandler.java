package chain_of_responsibility;

abstract class SuporteHandler {

    protected SuporteHandler proximo;

    public void setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
    }

    public abstract void tratarRequisicao(String tipo);
}