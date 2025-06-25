package mediator;

public class Aviao implements Aeronave {

    private final String nome;
    private final TorreDeControle torre;

    public Aviao(String nome, TorreDeControle torre) {
        this.nome = nome;
        this.torre = torre;
        torre.registrarAeronave(this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviando mensagem: " + mensagem);
        torre.enviarMensagem(mensagem, this);
    }
}
