package facade;

public class HomeTheaterFacade {

    private Amplificador amp;
    private Projetor projetor;
    private DVDPlayer dvd;
    private Luzes luzes;
    private Tela tela;

    public HomeTheaterFacade(Amplificador amp, Projetor projetor, DVDPlayer dvd, Luzes luzes, Tela tela) {
        this.amp = amp;
        this.projetor = projetor;
        this.dvd = dvd;
        this.luzes = luzes;
        this.tela = tela;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir um filme...");
        luzes.escurecer();
        tela.baixar();
        projetor.ligar();
        projetor.modoCinema();
        amp.ligar();
        amp.configurarSomSurround();
        dvd.ligar();
        dvd.reproduzir(filme);
    }

    public void encerrarFilme() {
        System.out.println("Encerrando o filme...");
        dvd.desligar();
        amp.desligar();
        projetor.desligar();
        tela.levantar();
        luzes.acender();
    }
}
