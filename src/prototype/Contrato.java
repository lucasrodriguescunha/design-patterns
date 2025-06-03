package prototype;

public class Contrato implements Prototype {

    private String tipo;
    private String conteudo;

    public Contrato(String tipo, String conteudo) {
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    @Override
    public Prototype clonar() {
        return new Contrato(this.tipo, this.conteudo);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "tipo='" + tipo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
