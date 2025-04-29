package ch15.sec02.ex01;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Board> arrayList=new ArrayList<>();
        for(int i=0;i<5;i++){
            String subject=String.format("제목%d",i+1);
            String content=String.format("내용%d",i+1);
            String writer=String.format("작가%d",i+1);
            arrayList.add(new Board(subject,content,writer));
        }

        System.out.println(arrayList.size());

        for(int i=0;i<5;i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println();
        System.out.println(arrayList.get(2));
        System.out.println();
        arrayList.remove(2);
        arrayList.remove(2);

        for(Board b:arrayList){
            System.out.println(b);
        }
    }
}
