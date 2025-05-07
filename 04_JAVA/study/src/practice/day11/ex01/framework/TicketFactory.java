package practice.day11.ex01.framework;

public abstract class TicketFactory {
    protected abstract Ticket createTicket(String owner);
    protected abstract void registerTicket(Ticket ticket);

    public final Ticket create(String owner){
        Ticket t=createTicket(owner);
        registerTicket(t);
        return t;
    }


}
