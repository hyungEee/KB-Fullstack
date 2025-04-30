package practice.day10.ex03;

import java.util.*;

public class DollHistoryManager {
    private Map<String, List<String>> historyMap=new TreeMap<>();

    public void addHistory(String customer, String doll){
        if(historyMap.containsKey(customer)){
            historyMap.get(customer).add(doll);
        }else{
            List<String> newList=new ArrayList<>();
            newList.add(doll);
            historyMap.put(customer,newList);
        }
        System.out.println("📒 "+customer+" 님의 인형 기록에 '"+doll+"'이 추가되었습니다.\n");
    }

    public void showAllHistory(){
        for(Map.Entry<String,List<String>> entry:historyMap.entrySet()){
            System.out.println("- "+entry.getKey()+": "+entry.getValue());
        }
        System.out.println();
    }
}
