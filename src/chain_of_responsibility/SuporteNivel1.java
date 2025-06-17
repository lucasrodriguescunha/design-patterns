package chain_of_responsibility;

public class SuporteNivel1 extends SuporteHandler {

    @Override
    public void tratarRequisicao(String tipo) {
        if (tipo.equalsIgnoreCase("simples")) {
            System.out.println("Suporte Nível 1: Resolvi a solicitação simples.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(tipo);
        }
    }
}