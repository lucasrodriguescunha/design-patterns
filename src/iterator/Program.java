package iterator;

import static iterator.Farmacia.imprimirProdutos;

public class Program {

    public static void main(String[] args) {

        CatalogoProdutos controlados = new ProdutosControlados();
        CatalogoProdutos comuns = new ProdutosComuns();

        System.out.println("Produtos Controlados:");
        imprimirProdutos(controlados);

        System.out.println("\nProdutos Comuns:");
        imprimirProdutos(comuns);
    }
}

