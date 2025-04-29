package practice.day09.ex05;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QuizIterator implements Iterator<QuizNode> {

    private QuizLinkedList quizList;
    private int index;

    public QuizIterator(QuizLinkedList quizList){
        this.quizList=quizList;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if(index<quizList.size()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public QuizNode next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        QuizNode cur=quizList.head;
        int curIdx=0;
        while(curIdx<index){
            cur=cur.next;
            curIdx++;
        }
        index++;
        return cur;
    }
}
