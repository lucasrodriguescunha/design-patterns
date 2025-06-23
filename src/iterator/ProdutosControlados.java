package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProdutosControlados implements CatalogoProdutos {

    private final List<Produto> produtos = new ArrayList<>();

    public ProdutosControlados() {
        adicionarProduto("Morfina", 50.0);
        adicionarProduto("Rivotril", 30.0);
    }

    public void adicionarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));
    }

    @Override
    public Iterator<Produto> criarIterator() {
        return produtos.iterator(); // Iterator do ArrayList
    }
}
