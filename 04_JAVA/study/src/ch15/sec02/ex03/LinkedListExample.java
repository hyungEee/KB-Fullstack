package ch15.sec02.ex03;

import ch15.sec02.ex01.Board;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Board> linkedList=new LinkedList<>();
        for(int i=0;i<5;i++){
            String subject=String.format("제목%d",i+1);
            String content=String.format("내용%d",i+1);
            String writer=String.format("작가%d",i+1);
            linkedList.add(new Board(subject,content,writer));
        }

        System.out.println(linkedList.size());

        for(int i=0;i<5;i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println();
        System.out.println(linkedList.get(2));
        System.out.println();
        linkedList.remove(2);
        linkedList.remove(2);

        for(Board b:linkedList){
            System.out.println(b);
        }
    }
}
