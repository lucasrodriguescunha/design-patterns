package abstract_factory;

public class ServicoEntrega {

    private Transporte transporte;
    private Embalagem embalagem;

    public ServicoEntrega(FabricaEntrega fabrica) {
        this.transporte = fabrica.criarTransporte();
        this.embalagem = fabrica.criarEmbalagem();
    }

    public void processarEntrega() {
        embalagem.embalar();
        transporte.entregar();
    }
}