package decorator;

public class Chantilly extends BebidaDecorator {

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.0;
    }
}
