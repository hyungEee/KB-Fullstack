package practice.day11.ex01.framework;

public abstract class Ticket {
    private String name;
    public Ticket(String name) {
        this.name=name;
    }

    public abstract void enter();
    @Override
    public String toString() {
        return "[MetaMonTicket: "+name+"]";
    }
}
