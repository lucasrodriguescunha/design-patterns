package factory_method;

public class Bicicleta implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega realizada por Bicicleta.");
    }
}


