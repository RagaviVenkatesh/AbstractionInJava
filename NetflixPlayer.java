public abstract class NetflixPlayer {
    // Abstract method: contract to be implemented by subclasses
    public abstract void play(String title);

    // Concrete method: shared logic
    public void pause() {
        System.out.println("Paused your content.");
    }
}
