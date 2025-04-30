package practice.day10.ex06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DollQueueManager dqm=new DollQueueManager();
        DollStackManager dsm=new DollStackManager();
        DollHistoryManager dhm=new DollHistoryManager();
        DollPopularityManager dpm=new DollPopularityManager();
        Scanner sc=new Scanner(System.in);

        Command[] commands={
                new ExitCommand(),
                new RegisterCustomerCommand(dqm),
                new GetDollCommand(dqm,dsm,dpm,dhm),
                new ShowWaitinglistCommand(dqm),
                new ShowStackCommand(dsm),
                new ShowHistoryCommand(dhm),
                new ShowUniqueHistoryCommand(dhm),
                new ShowRankingCommand(dpm),

        };

        System.out.println("=== 유라의 인형뽑기 가게 ===\n[1] 고객 등록\n[2] 뽑기 진행 (보관 + 기록)\n[3] 현재 대기열 보기\n"+
                "[4] 보관함 보기\n[5] 고객별 인형 기록 보기\n[6] 중복 제거된 인형 목록 보기\n[7] 인형별 인기 순위 보기\n[0] 종료");
        while(true){
            System.out.print("선택 >> ");
            int sel=sc.nextInt();
            commands[sel].execute();
        }
    }

}
