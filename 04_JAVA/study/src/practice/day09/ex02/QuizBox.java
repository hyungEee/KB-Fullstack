package practice.day09.ex02;
import java.util.Arrays;


public class QuizBox<T extends Content> {
    Object[] list;
    int size;

    public QuizBox() {
        list= new Content[5];
        size=0;
    }

    public void add(T content){
        if(size==list.length) {
            list = Arrays.copyOf(list, size*2);
        }
        list[size] = content;
        size+=1;
    }

    boolean remove(Content content){
        int index=0;
        Object[] newList=new Content[size-1];
        for(int i=0;i<size;i++){
            if(list[i].equals(content)){
                index=i;
                break;
            }
            newList[i]=list[i];
            if(i==size-1){
                return false;
            }
        }
        for(int i=index+1;i<size;i++){
            newList[i-1]=list[i];
        }
        size-=1;
        list=newList;
        return true;
    }

    static <T extends Content> void removeFromBox(QuizBox<? super T>box,T quiz){
        int index=0;
        Object[] newList=new Content[box.size-1];
        for(int i=0;i<box.size;i++){
            if(box.list[i].equals(quiz)){
                index=i;
                break;
            }
            newList[i]=box.list[i];
            if(i==box.size-1){
                return;
            }
        }
        for(int i=index+1;i<box.size;i++){
            newList[i-1]=box.list[i];
        }
        box.size-=1;
        box.list=newList;
    }

    public void printAll(){
        for(int i=0;i<size;i++){
            if (list[i] != null) {
                System.out.println((i+1)+". "+((Content)list[i]).getQuestion());
            }
        }
    }
}
