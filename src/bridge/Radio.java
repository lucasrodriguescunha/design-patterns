package bridge;

public class Radio implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Rádio ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Rádio desligado");
    }

    @Override
    public void ajustarVolume(int nivel) {
        System.out.println("Volume do rádio ajustado para: " + nivel);
    }
}
