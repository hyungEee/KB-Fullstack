package practice.day08.ex04;

import lombok.Getter;

public class Fan implements Runnable{
    @Getter
    private String name;
    private boolean isVIP;
    private EntryManager entryManager;
    protected TicketBuyer ticketBuyer;

    public Fan(String name, boolean isVIP, EntryManager entryManager,TicketBuyer ticketBuyer) {
        this.name = name;
        this.isVIP = isVIP;
        this.entryManager = entryManager;
        this.ticketBuyer=ticketBuyer;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public void run() {
        entryManager.registerFan(this);
        while(!entryManager.processEntry(this)){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticketBuyer.waitTurn();
            entryManager.registerFan(this);
        }
    }
}
