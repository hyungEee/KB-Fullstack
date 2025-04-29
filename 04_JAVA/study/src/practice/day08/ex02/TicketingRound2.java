package practice.day08.ex02;

public class TicketingRound2 {
    public static void main(String[] args) {
        AbstractTicketEvent event = new FestivalTicketEvent(5);
        event.startEvent();
    }
}
