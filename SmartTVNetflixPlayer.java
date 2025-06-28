public class SmartTVNetflixPlayer extends NetflixPlayer {
    @Override
    public void play(String title) {
        System.out.println("Streaming '" + title + "' on Smart TV 📺");
    }
}
