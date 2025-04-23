package practice.day06;

public class GenrePlaybackManager {

    public interface GenrePlayer {
        void play(String title, String artist);
    }

    private GenrePlayer gp;

    public void setPlayer(GenrePlayer player){ // 전략 주입
        this.gp=player;
    }
    public void play(String title, String artist){ // 전략에 따른 재생 실행
        this.gp.play(title,artist);
    }
}
