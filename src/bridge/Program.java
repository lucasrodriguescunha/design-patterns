package bridge;

public class Program {

    public static void main(String[] args) {

        Dispositivo tv = new TV();
        Dispositivo radio = new Radio();

        ControleRemoto controleTv = new ControleSimples(tv);
        ControleRemoto controleRadio = new ControleSimples(radio);

        controleTv.ligar();
        controleTv.aumentarVolume();
        controleTv.desligar();

        System.out.println("----------------");

        controleRadio.ligar();
        controleRadio.aumentarVolume();
        controleRadio.desligar();
    }
}
