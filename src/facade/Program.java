package facade;

public class Program {

    public static void main(String[] args) {

        // Criando os subsistemas
        Amplificador amp = new Amplificador();
        Projetor projetor = new Projetor();
        DVDPlayer dvd = new DVDPlayer();
        Luzes luzes = new Luzes();
        Tela tela = new Tela();

        // Criando o facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projetor, dvd, luzes, tela);

        // Cliente usa uma interface simples
        homeTheater.assistirFilme("Senhor dos Anéis");
        System.out.println();
        homeTheater.encerrarFilme();
    }
}
