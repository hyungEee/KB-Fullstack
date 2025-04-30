package practice.day10.ex06;

import java.util.*;

public class DollPopularityManager {

    private Map<String,Integer> countMap=new HashMap<>();
    public void addDoll(String dollName){
        countMap.put(dollName, countMap.getOrDefault(dollName, 0) + 1);
    }
    public void showRanking(){
        List<Map.Entry<String,Integer>> rank=new ArrayList<>(countMap.entrySet());

        Collections.sort(rank, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue()<o2.getValue()){
                    return 1;
                } else if (o1.getValue()>o2.getValue()) {
                    return -1;
                }else{
                    return o1.getKey().compareToIgnoreCase(o2.getKey());
                }
            }
        });

        System.out.println("\uD83D\uDD25 인형별 인기 순위 (많이 뽑힌 순):");
        for(int i=0;i<rank.size();i++){
            Map.Entry<String, Integer> r=rank.get(i);
            System.out.println((i+1)+". "+r.getKey()+" - "+r.getValue()+"회");
        }
        System.out.println();

    }
}
