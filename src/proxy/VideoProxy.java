package proxy;

public class VideoProxy implements Video {

    private final VideoImpl video;
    private final boolean usuarioPremium;

    public VideoProxy(VideoImpl video, boolean usuarioPremium) {
        this.video = video;
        this.usuarioPremium = usuarioPremium;
    }

    @Override
    public void play() {
        if (video.isPremium()) {
            if (usuarioPremium) {
                video.play();
            } else {
                System.out.println("Acesso negado. Torne-se um usuário premium para assistir a este vídeo.");
            }
        } else {
            video.play();
        }
    }
}
