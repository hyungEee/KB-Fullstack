package practice.day08.ex04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EntryManager {

    private Stack<Fan> st = new Stack<>();
    private int ticketCount;

    public EntryManager(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    void registerFan(Fan fan){
        st.push(fan);
    }

    synchronized boolean processEntry(Fan fan){
        if(!st.isEmpty()) {
            if (fan == st.peek()) {
                fan.ticketBuyer.entranceMessage(fan.getName());
                st.pop();
                return true;
            }
        }
        return false;
    }

}
