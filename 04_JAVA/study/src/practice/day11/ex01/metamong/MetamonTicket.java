package practice.day11.ex01.metamong;

import practice.day11.ex01.framework.Ticket;

public class MetamonTicket extends Ticket {

    public MetamonTicket(String name) {
        super(name);
        System.out.println("["+name+"]님의 메타몽 티켓을 발급합니다.");
    }

    @Override
    public void enter() {
        System.out.println(this+"님이 입장하였습니다.");
    }
}
