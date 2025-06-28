public class AbstractionDemo {
    public static void main(String[] args) {
        NetflixPlayer player;

        player = new MobileNetflixPlayer();
        player.play("Stranger Things");
        player.pause();

        System.out.println();

        player = new SmartTVNetflixPlayer();
        player.play("Breaking Bad");
        player.pause();
    }
}
