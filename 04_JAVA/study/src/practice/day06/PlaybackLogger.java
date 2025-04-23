package practice.day06;

public class PlaybackLogger {
    void log(String title, String artist){
        class RecentLog{
            final String title;
            final String artist;

            public RecentLog(String title, String artist) {
                this.title = title;
                this.artist = artist;
            }

            void printLog(){
                System.out.print("\uD83C\uDFBC 최근 재생: "+title+" - "+artist);
                if(title.length()>=10 || artist.length()>=10) {
                    System.out.println(" (인기곡)");
                }else{
                    System.out.println();
                }
            }
        }
        RecentLog r=new RecentLog(title, artist);
        r.printLog();
    }
}
