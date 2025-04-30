package practice.day10.ex06;

import java.util.Scanner;

public class GetDollCommand implements Command{
    DollQueueManager dqm;
    DollStackManager dsm;
    DollPopularityManager dpm;
    DollHistoryManager dhm;

    public GetDollCommand(DollQueueManager dqm, DollStackManager dsm, DollPopularityManager dpm, DollHistoryManager dhm) {
        this.dqm = dqm;
        this.dsm = dsm;
        this.dpm = dpm;
        this.dhm = dhm;
    }

    @Override
    public void execute() {
        Scanner sc=new Scanner(System.in);

        String next=dqm.getNextCustomer();
        if(next==null){
            System.out.println("⛔ 대기 중인 고객이 없습니다.\n");
        }else{
            System.out.println("🎉 "+next+" 님! 인형 뽑기 하러 오세요!");
            String dollname=dsm.storeRandomDoll();
            dhm.addHistory(next,dollname);
            dpm.addDoll(dollname);

            System.out.print("👉 "+next+" 님, 한 번 더 뽑으시겠습니까? (y/n):");

            String yn=sc.nextLine();
            if(yn.equals("y")){
                dqm.registerCustomer(next);
                System.out.println("🔄 "+next+" 님이 다시 대기열에 등록되었습니다.");
            }
            System.out.println();
        }
    }
}
