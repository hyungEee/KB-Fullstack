package practice.day10.ex01;

import java.util.LinkedList;
import java.util.Queue;

public class DollQueueManager {
    private Queue<String> queue=new LinkedList<>();

    public void registerCustomer(String name){ // 고객 등록
        queue.offer(name);
        System.out.println("👉 "+name+" 님이 대기열에 등록되었습니다.\n");
    }
    public void processNextCustomer(){ // 첫 고객 뽑기 실행
        System.out.println("🎉 "+queue.poll()+" 님! 인형 뽑기 하러 오세요!\n");
    }
    public void showWaitingList(){// 현재 대기열 출력
        System.out.println("📋 현재 대기열: "+queue+"\n");
    }
}
