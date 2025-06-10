package decorator;

public class Program {

    public static void main(String[] args) {

        Bebida pedido = new CafeSimples(); // Café simples
        pedido = new Leite(pedido); // Adiciona leite
        pedido = new Chantilly(pedido); // Adiciona chantilly

        System.out.println("Pedido: " + pedido.getDescricao());
        System.out.println("Preço: R$" + pedido.getPreco());
    }
}
