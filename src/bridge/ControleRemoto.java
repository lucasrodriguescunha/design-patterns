package bridge;

public abstract class ControleRemoto {

    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void ligar();

    public abstract void desligar();

    public abstract void aumentarVolume();
}
