package abstract_factory;

public class Drone implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega realizada por Drone.");
    }
}
