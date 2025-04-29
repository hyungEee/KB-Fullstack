package practice.day08.ex04;

public class TicketingRound4 {
    public static void main(String[] args) {
        EntryManager entryManager=new EntryManager(5);
        Fan[] fans = {
                new Fan("팬1", false, entryManager, new RegularBuyer()),
                new Fan("팬2", true, entryManager,new VIPBuyer()),
                new Fan("팬3", false, entryManager,new SlowBuyer()),
                new Fan("팬4", true, entryManager,new VIPBuyer()),
                new Fan("팬5", false, entryManager,new RegularBuyer())
        };
        System.out.printf("이벤트 시작! 남은 티켓: %d장\n",fans.length);
        Thread[] fanThreads=new Thread[fans.length];
        for(int i=0;i<fans.length;i++){
            fanThreads[i]=new Thread(fans[i]);
            fanThreads[i].start();
        }
        for(int i=0;i<fans.length;i++){
            try {
                fanThreads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("이벤트 종료! 모두 수고하셨습니다 🎉");
    }
}
