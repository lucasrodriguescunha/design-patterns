package command;

public class ComandoLigarLuz implements Comando {

    private final Luz luz;

    public ComandoLigarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }
}
