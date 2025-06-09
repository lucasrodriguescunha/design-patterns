package adapter;

public class CartaoAdapter implements LeitorDeCartao {

    private LeitorDeCartaoAntigo leitorAntigo;

    public CartaoAdapter(LeitorDeCartaoAntigo leitorAntigo) {
        this.leitorAntigo = leitorAntigo;
    }

    @Override
    public void lerCartao(String numero) {
        leitorAntigo.processarCartaoAntigo(numero);
    }
}
