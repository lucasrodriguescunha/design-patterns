package flyweight;

public class FontStyle {

    private final String fontFamily;
    private final int fontSize;
    private final boolean bold;
    private final boolean italic;

    public FontStyle(String fontFamily, int fontSize, boolean bold, boolean italic) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.bold = bold;
        this.italic = italic;
    }

    public void aplicar(String character, int linha, int coluna) {
        System.out.printf("Caractere '%s' em [%d,%d] com fonte %s, tamanho %d, bold: %b, italic: %b%n",
                character, linha, coluna, fontFamily, fontSize, bold, italic);
    }
}
