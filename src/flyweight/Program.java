package flyweight;

public class Program {

    public static void main(String[] args) {

        FontStyle estilo1 = FontFactory.getFont("Arial", 12, false, false);
        FontStyle estilo2 = FontFactory.getFont("Arial", 12, true, false);

        Character c1 = new Character("H", 0, 0, estilo1);
        Character c2 = new Character("e", 0, 1, estilo1);
        Character c3 = new Character("l", 0, 2, estilo1);
        Character c4 = new Character("l", 0, 3, estilo1);
        Character c5 = new Character("o", 0, 4, estilo2); // mesma fonte, mas estilo diferente

        c1.renderizar();
        c2.renderizar();
        c3.renderizar();
        c4.renderizar();
        c5.renderizar();
    }
}
