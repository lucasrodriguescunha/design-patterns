package iterator;

import java.util.Iterator;

public class ProdutosComuns implements CatalogoProdutos {

    private final Produto[] produtos = new Produto[2];
    private int indice = 0;

    public ProdutosComuns() {
        adicionarProduto("Paracetamol", 5.00);
        adicionarProduto("Dipirona", 3.5);
    }

    public void adicionarProduto(String nome, double preco) {
        if (indice < produtos.length) {
            produtos[indice++] = new Produto(nome, preco);
        }
    }

    @Override
    public Iterator<Produto> criarIterator() {
        return new Iterator<>() {
            private int posicao = 0;

            @Override
            public boolean hasNext() {
                return posicao < produtos.length && produtos[posicao] != null;
            }

            @Override
            public Produto next() {
                return produtos[posicao++];
            }
        };
    }
}
