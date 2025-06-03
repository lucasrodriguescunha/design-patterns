package singleton;

public class Program {
    public static void main(String[] args) {

        // Tentanto obter várias instâncias
        GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();

        // Usando o gerenciador
        g1.imprimir("Relatório Mensal");
        g2.imprimir("Contrato de Fornecimento");

        // Testando se são a mesma instância
        System.out.println(g1 == g2); // true
    }
}
