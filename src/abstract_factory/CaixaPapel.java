package abstract_factory;

public class CaixaPapel implements Embalagem {

    @Override
    public void embalar() {
        System.out.println("Produto embalado em caixa de papelão.");
    }
}
