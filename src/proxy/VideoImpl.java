package proxy;

public class VideoImpl implements Video {

    private final String titulo;
    private final boolean premium;

    public VideoImpl(String titulo, boolean premium) {
        this.titulo = titulo;
        this.premium = premium;
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo vídeo: " + titulo);
    }

    public boolean isPremium() {
        return premium;
    }
}
