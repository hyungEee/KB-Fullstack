package practice.day08.ex04;

public class RegularBuyer implements TicketBuyer{
    @Override
    public void waitTurn() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void entranceMessage(String name) {
        System.out.println(name+" 입장 완료!");
    }
}
