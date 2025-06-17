package chain_of_responsibility;

public class SuporteSupervisor extends SuporteHandler {

    @Override
    public void tratarRequisicao(String tipo) {
        if (tipo.equalsIgnoreCase("grave")) {
            System.out.println("Supervisor: Resolvi o problema grave.");
        } else {
            System.out.println("Supervisor: Não consigo resolver esse tipo de problema.");
        }
    }
}