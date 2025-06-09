package bridge;

public class TV implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada");
    }

    @Override
    public void ajustarVolume(int nivel) {
        System.out.println("Volume da TV ajustado para: " + nivel);
    }
}
