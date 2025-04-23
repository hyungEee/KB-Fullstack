package practice.day06;

public class LegacyPlayerAdapter implements Playable{
    private Playable p;

    public LegacyPlayerAdapter(Playable p) {
        this.p = p;
    }

    @Override
    public void play(String title) {
    }
}
