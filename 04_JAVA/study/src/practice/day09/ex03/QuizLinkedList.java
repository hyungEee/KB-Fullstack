package practice.day09.ex03;

public class QuizLinkedList {
    QuizNode head;

    void addLast(String title, String content){

        if(head==null){
            head=new QuizNode(title, content);
            return;
        }

        QuizNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new QuizNode(title, content);

    }

    void printAll(){
        System.out.println("===도전할 문제 리스트===");

        QuizNode cur=head;
        while(cur!=null){
            System.out.println("문제 제목: "+cur.title);
            System.out.println("문제 내용: "+cur.content+"\n");
            cur=cur.next;
        }
    }
}
