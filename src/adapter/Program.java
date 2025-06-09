package adapter;

public class Program {
    public static void main(String[] args) {

        LeitorDeCartaoAntigo leitorAntigo = new LeitorDeCartaoAntigo();
        LeitorDeCartao leitor = new CartaoAdapter(leitorAntigo);

        leitor.lerCartao("1234-5678");
    }
}
