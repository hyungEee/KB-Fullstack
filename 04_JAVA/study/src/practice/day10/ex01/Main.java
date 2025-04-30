package practice.day10.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DollQueueManager dqm=new DollQueueManager();
        Scanner sc=new Scanner(System.in);

        System.out.println("=== 유라의 인형뽑기 가게 ===\n[1] 고객 등록\n[2] 뽑기 진행\n[3] 현재 대기열 보기\n[0] 종료");
        while(true){
            System.out.print("선택 >> ");
            int sel=sc.nextInt();
            switch (sel){
                case 1:
                    dqm.registerCustomer(RandomCustomerProvider.getRandomCustomer());
                    break;
                case 2:
                    dqm.processNextCustomer();
                    break;
                case 3:
                    dqm.showWaitingList();
                    break;
                case 0:
                    System.out.println("👋 프로그램을 종료합니다.");
                    return;
            }
        }
    }

}
