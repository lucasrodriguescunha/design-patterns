package proxy;

public class Program {

    public static void main(String[] args) {

        Video videoGratis = new VideoProxy(new VideoImpl("Documentário Natureza", false), false);
        Video videoPremium = new VideoProxy(new VideoImpl("Filme Exclusivo", true), false);
        Video videoPremiumComAcesso = new VideoProxy(new VideoImpl("Filme Exclusivo", true), true);

        System.out.println("Usuário comum acessando vídeo grátis:");
        videoGratis.play();

        System.out.println("\nUsuário comum acessando vídeo premium:");
        videoPremium.play();

        System.out.println("\nUsuário premium acessando vídeo premium:");
        videoPremiumComAcesso.play();
    }
}
