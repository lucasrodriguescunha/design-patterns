package factory_method;

public class Drone implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega realizada por Drone.");
    }
}
