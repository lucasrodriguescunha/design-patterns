package chain_of_responsibility;

public class Program {

    public static void main(String[] args) {

        SuporteHandler nivel1 = new SuporteNivel1();
        SuporteHandler nivel2 = new SuporteNivel2();
        SuporteHandler supervisor = new SuporteSupervisor();

        nivel1.setProximo(nivel2);
        nivel2.setProximo(supervisor);

        nivel1.tratarRequisicao("simples");
        nivel2.tratarRequisicao("tecnico");
        nivel1.tratarRequisicao("grave");
        nivel1.tratarRequisicao("desconhecido");
    }
}