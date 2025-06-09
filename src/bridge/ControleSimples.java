package bridge;

public class ControleSimples extends ControleRemoto {

    public ControleSimples(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligar() {
        dispositivo.ligar();
    }

    @Override
    public void desligar() {
        dispositivo.desligar();
    }

    @Override
    public void aumentarVolume() {
        dispositivo.ajustarVolume(10);
    }
}
