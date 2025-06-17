package chain_of_responsibility;

public class SuporteNivel2 extends SuporteHandler {

    @Override
    public void tratarRequisicao(String tipo) {
        if (tipo.equalsIgnoreCase("tecnico")) {
            System.out.println("Suporte Nível 2: Resolvi o problema técnico.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(tipo);
        }
    }
}