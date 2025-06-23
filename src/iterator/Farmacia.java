package iterator;

import java.util.Iterator;

public class Farmacia {

    public static void imprimirProdutos(CatalogoProdutos catalogo) {
        Iterator<Produto> iterator = catalogo.criarIterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println(produto);
        }
    }
}
