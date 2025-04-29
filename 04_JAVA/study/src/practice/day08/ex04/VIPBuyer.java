package practice.day08.ex04;

public class VIPBuyer implements TicketBuyer{

    @Override
    public void waitTurn() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void entranceMessage(String name) {
        System.out.println("VIP "+name+" 입장 완료!");
    }
}
