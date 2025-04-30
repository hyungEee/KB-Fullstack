package practice.day10.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DollQueueManager dqm=new DollQueueManager();
        DollStackManager dsm=new DollStackManager();
        Scanner sc=new Scanner(System.in);

        System.out.println("=== 유라의 인형뽑기 가게 ===\n[1] 고객 등록\n[2] 뽑기 진행 (인형 보관)\n[3] 현재 대기열 보기\n[4] 보관함 보기\n[0] 종료");
        while(true){
            System.out.print("선택 >> ");
            int sel=sc.nextInt();
            switch (sel){
                case 1: // 고객 등록
                    dqm.registerCustomer(RandomCustomerProvider.getRandomCustomer());
                    break;
                case 2: // 뽑기 진행 (인형 보관)
                    String next=dqm.getNextCustomer();
                    if(next==null){
                        System.out.println("⛔ 대기 중인 고객이 없습니다.\n");
                    }else{
                        System.out.println("🎉 "+next+" 님! 인형 뽑기 하러 오세요!");
                        dsm.storeRandomDoll();
                    }
                    break;
                case 3: // 현재 대기열
                    dqm.showWaitingList();
                    break;
                case 4: // 보관함 보기
                    dsm.showStack();
                    break;
                case 0: // 종료
                    System.out.println("👋 프로그램을 종료합니다.");
                    return;
            }
        }
    }

}
