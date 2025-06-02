package abstract_factory;

public class CaixaTermica implements Embalagem {

    @Override
    public void embalar() {
        System.out.println("Produto embalado em caixa térmica.");
    }
}
