package practice.day06;

public class MusicPlayer {
    public interface PlayResultListener {
        void onSuccess(String title);
        void onError(String title, int errorCode);
    }
    PlayResultListener prl = null;
    void play(String title, boolean isSuccess, PlayResultListener listener){
        this.prl=listener;
        if(isSuccess){
            this.prl.onSuccess(title);
        }else{
            this.prl.onError(title,500);
        }
    }

}
