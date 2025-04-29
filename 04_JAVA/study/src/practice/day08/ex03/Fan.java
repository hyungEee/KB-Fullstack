package practice.day08.ex03;

import lombok.Getter;

public class Fan implements Runnable{
    @Getter
    private String name;
    private boolean isVIP;
    private EntryManager entryManager;

    public Fan(String name, boolean isVIP, EntryManager entryManager) {
        this.name = name;
        this.isVIP = isVIP;
        this.entryManager = entryManager;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public void run() {
        while(!entryManager.processEntry(this)){
            entryManager.registerFan(this);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
