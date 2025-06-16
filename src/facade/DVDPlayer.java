package facade;

public class DVDPlayer {

    void ligar() {
        System.out.println("DVD Player ligado");
    }

    void desligar() {
        System.out.println("DVD Player desligado");
    }

    void reproduzir(String filme) {
        System.out.println("Reproduzindo filme: " + filme);
    }
}
