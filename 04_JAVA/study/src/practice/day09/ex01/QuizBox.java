package practice.day09.ex01;

import java.util.Arrays;

public class QuizBox<T extends Quiz> {
    private T[] list;
    private int size;

    public QuizBox() {
        list= (T[])new Quiz[5];
        size=0;
    }

    public void addQuiz(T quiz){
        if(size==list.length) {
            list = Arrays.copyOf(list, size + 1);

        }
        list[size] = quiz;
        size+=1;
    }

    public void printAll(){
        for(int i=0;i< size;i++){
            System.out.println((i+1)+". "+list[i].getQuestion());
        }
    }
}
