package practice.day08.ex03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EntryManager {

    private Stack<Fan> vipStack = new Stack<>();
    private Queue<Fan> normalQueue = new LinkedList<>();
    private int ticketCount;

    public EntryManager(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    void registerFan(Fan fan){
        if(fan.isVIP()){
            vipStack.push(fan);
        }else{
            normalQueue.offer(fan);
        }
    }

    synchronized boolean processEntry(Fan fan){
        if(!vipStack.isEmpty()) {
            if (fan.isVIP()) {
                System.out.println("VIP " + fan.getName() + " 입장 완료!");
                vipStack.remove(fan);
                return true;
            }
        }else {
            if (!normalQueue.isEmpty()&& fan == normalQueue.peek()) {
                    System.out.println(fan.getName() + " 입장 완료!");
                    normalQueue.poll();
                    return true;
            }
        }
        return false;
    }

}
