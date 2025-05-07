package practice.day11.ex01;

import practice.day11.ex01.framework.Ticket;
import practice.day11.ex01.framework.TicketFactory;
import practice.day11.ex01.metamong.MetamonTicketFactory;

public class Main {
    public static void main(String[] args) {
        TicketFactory factory = new MetamonTicketFactory();
        Ticket jiwoo = factory.create("지우");
        Ticket isul = factory.create("이슬이");

        System.out.println();

        jiwoo.enter();
        isul.enter();
    }
}
