package mediator;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    private final List<Aeronave> aeronaves = new ArrayList<>();

    public void registrarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    public void enviarMensagem(String mensagem, Aeronave remetente) {
        for (Aeronave aeronave : aeronaves) {
            if (aeronave != remetente) {
                aeronave.receberMensagem(mensagem);
            }
        }
    }
}
