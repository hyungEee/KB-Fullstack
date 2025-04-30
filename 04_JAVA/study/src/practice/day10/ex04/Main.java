package practice.day10.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DollQueueManager dqm=new DollQueueManager();
        DollStackManager dsm=new DollStackManager();
        DollHistoryManager dhm=new DollHistoryManager();
        Scanner sc=new Scanner(System.in);

        System.out.println("=== 유라의 인형뽑기 가게 ===\n[1] 고객 등록\n[2] 뽑기 진행 (보관 + 기록)\n[3] 현재 대기열 보기\n[4] 보관함 보기\n[5] 고객별 인형 기록 보기\n[6] 중복 제거된 인형 목록 보기\n[0] 종료");
        while(true){
            System.out.print("선택 >> ");
            int sel=sc.nextInt();
            switch (sel){
                case 1: // 고객 등록
                    dqm.registerCustomer(RandomCustomerProvider.getRandomCustomer());
                    System.out.println();
                    break;
                case 2: // 뽑기 진행 (인형 보관)
                    String next=dqm.getNextCustomer();
                    if(next==null){
                        System.out.println("⛔ 대기 중인 고객이 없습니다.\n");
                    }else{
                        System.out.println("🎉 "+next+" 님! 인형 뽑기 하러 오세요!");
                        String dollname=dsm.storeRandomDoll();
                        dhm.addHistory(next,dollname);

                        System.out.print("👉 "+next+" 님, 한 번 더 뽑으시겠습니까? (y/n):");
                        sc.nextLine();
                        String yn=sc.nextLine();
                        if(yn.equals("y")){
                            dqm.registerCustomer(next);
                            System.out.println("🔄 "+next+" 님이 다시 대기열에 등록되었습니다.");
                        }
                        System.out.println();
                    }
                    break;
                case 3: // 현재 대기열
                    dqm.showWaitingList();
                    break;
                case 4: // 보관함 보기
                    dsm.showStack();
                    break;
                case 5:
                    dhm.showAllHistory();
                    break;
                case 6:
                    dhm.showAllUniqueHistory();
                    break;
                case 0: // 종료
                    System.out.println("👋 프로그램을 종료합니다.");
                    return;
            }
        }
    }

}
