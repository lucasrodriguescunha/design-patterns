package prototype;

public class Program {
    public static void main(String[] args) {

        // Modelo padrão
        Contrato modeloContrato = new Contrato("Aluguel", "Este é um contrato padrão de aluguel.");

        // Clonando o modelo
        Contrato contratoCliente1 = (Contrato) modeloContrato.clonar();
        contratoCliente1.setConteudo("Este é o contrato de aluguel do Cliente 1");

        Contrato contratoCliente2 = (Contrato) modeloContrato.clonar();
        contratoCliente2.setConteudo("Este é o contrato de aluguel do Cliente 2");

        // Exibindo
        System.out.println(modeloContrato);
        System.out.println(contratoCliente1);
        System.out.println(contratoCliente2);
    }
}
