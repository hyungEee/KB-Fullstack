package practice.day08.ex04;

public class SlowBuyer implements TicketBuyer{
    @Override
    public void waitTurn() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void entranceMessage(String name) {
        System.out.println(name+": 처음이라 떨려요... 입장 완료!");
    }
}
