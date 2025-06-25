package mediator;

public class Program {

    public static void main(String[] args) {

        TorreDeControle torre = new TorreDeControle();

        Aviao aviao1 = new Aviao("Avião 1", torre);
//        Aviao aviao2 = new Aviao("Avião 2", torre);
//        Aviao aviao3 = new Aviao("Avião 3", torre);

        aviao1.enviarMensagem("Solicitando permissão para pousar.");
    }
}
