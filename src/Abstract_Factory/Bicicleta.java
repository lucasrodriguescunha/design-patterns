package Abstract_Factory;

public class Bicicleta implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega realizada por Bicicleta.");
    }
}
