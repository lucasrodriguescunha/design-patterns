package singleton;

public class GerenciadorImpressao {

    // Instância única
    private static GerenciadorImpressao instancia;

    // Construtor privado para impedir criação externa
    private GerenciadorImpressao() {
        System.out.println("Gerenciador de Impressão criado!");
    }

    // Método público para fornecer acesso à instância
    public static GerenciadorImpressao getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorImpressao();
        }
        return instancia;
    }

    // Método de exemplo
    public void imprimir(String documento) {
        System.out.println("Imprimindo: " + documento);
    }
}
