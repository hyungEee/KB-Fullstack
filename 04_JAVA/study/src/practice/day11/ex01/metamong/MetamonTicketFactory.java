package practice.day11.ex01.metamong;

import practice.day11.ex01.framework.Ticket;
import practice.day11.ex01.framework.TicketFactory;

public class MetamonTicketFactory extends TicketFactory {
    @Override
    protected Ticket createTicket(String owner) {
        return new MetamonTicket(owner);
    }

    @Override
    protected void registerTicket(Ticket ticket) {
        System.out.println("티켓 "+ticket+" 등록 완료");
    }

}
