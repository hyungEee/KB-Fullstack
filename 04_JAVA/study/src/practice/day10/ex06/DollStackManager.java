package practice.day10.ex06;

import java.util.Stack;

public class DollStackManager {

    private String[] dolls = {
            "피카츄", "리자몽", "꼬부기", "쿠로미", "헬로키티",
            "뽀로로", "짱구", "도라에몽", "스폰지밥", "미니언"
    };

    private Stack<String> dollStack=new Stack<>();

    String storeRandomDoll(){
        String dollName=dolls[(int)(Math.random()*10)];
        dollStack.push(dollName);
        System.out.println("🧸 "+dollName+" 인형이 보관함에 추가되었습니다.");
        return dollName;
    }
    void showStack(){
        System.out.println("🧸 현재 보관 중인 인형: "+dollStack+"\n");
    }
}
