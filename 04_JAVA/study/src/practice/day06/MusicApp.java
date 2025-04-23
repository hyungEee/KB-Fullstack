package practice.day06;

public class MusicApp {
    String title;
    String artist;
    String genre;

    public MusicApp(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    class MusicPlayer{

        void play(){
            String emoji=getEffect(MusicApp.this.genre);
            System.out.println(emoji+" "+MusicApp.this.title+" - "+MusicApp.this.artist+" 을(를) 재생합니다."+emoji);
        }
        String getEffect(String genre){
            if(genre.equals("HIPHOP")){
                return "💥";
            }
            else if(genre.equals("BALLAD")){
                return "🎵";
            }
            else{
                return "🎧";
            }

        }
    }
}
