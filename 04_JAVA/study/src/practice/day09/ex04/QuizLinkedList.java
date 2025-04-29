package practice.day09.ex04;

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

    void addFirst(String title,String content){
        QuizNode newHead=new QuizNode(title,content);
        newHead.next=head;
        head=newHead;
    }

    void removeFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }

    void addAt(int index, String title, String content){
        if (index <= 0) {
            addFirst(title, content);
            return;
        }
        int size=this.size();
        if(index>=size){
            index=size;
            return;
        }
        int curIdx=0;
        QuizNode cur=head;
        while(curIdx<index-1){
            cur=cur.next;
            curIdx+=1;
        }
        QuizNode newNode=new QuizNode(title, content);
        newNode.next=cur.next;
        cur.next=newNode;
    }

    int size(){
        int size=0;
        QuizNode cur=head;
        while(cur!=null){
            size+=1;
            cur=cur.next;
        }
        return size;
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
