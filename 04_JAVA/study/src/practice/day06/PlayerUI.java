package practice.day06;

public class PlayerUI {
    public interface ClickListener {
        void onClick();
    }
    private ClickListener cl=null;
    void setClickListener(ClickListener listener){
        this.cl=listener;
    }
    void clickPlayButton(){
        if(cl!=null){
            cl.onClick();
        }
        else{
            System.out.println("❌ 리스너가 등록되지 않았습니다.");
        }
    }
}
