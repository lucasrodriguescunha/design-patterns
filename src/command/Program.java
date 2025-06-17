package command;

public class Program {

    public static void main(String[] args) {

        Luz luzDaSala = new Luz();

        Comando ligar = new ComandoLigarLuz(luzDaSala);
        Comando desligar = new ComandoDesligarLuz(luzDaSala);

        ControleRemoto controle = new ControleRemoto();

        controle.setComando(ligar);
        controle.pressionarBotao(); // Luz ligada.

        controle.setComando(desligar);
        controle.pressionarBotao(); // Luz desligada.
    }
}
