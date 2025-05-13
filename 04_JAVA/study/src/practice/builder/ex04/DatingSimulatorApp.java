package practice.builder.ex04;

import practice.builder.ex03.DatingCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatingSimulatorApp {
    public static void main(String[] args) {
        List<practice.builder.ex03.DatingCharacter> list=new ArrayList<>();
        list.add(DatingCharacter.builder()
                .name("지민")
                .personality("다정하고 감성적임")
                .hobby("춤")
                .favoriteFood("떡볶이")
                .talkStyle("부드럽고 공손함")
                .typeCode("S")
                .build());
        list.add(DatingCharacter.builder()
                .name("제니")
                .personality("도도하지만 배려심 있음")
                .hobby("여행")
                .favoriteFood("파스타")
                .talkStyle("털털한 반말")
                .typeCode("C")
                .build());
        list.add(DatingCharacter.builder()
                .name("민호")
                .personality("무뚝뚝한 츤데레")
                .hobby("몰라")
                .favoriteFood("몰라")
                .talkStyle("몰라")
                .typeCode("T")
                .build());

        Scanner sc=new Scanner(System.in);
        System.out.println("\uD83D\uDC98 대화하고 싶은 캐릭터를 선택하세요: ");
        for(int i=0;i< list.size();i++){
            System.out.println((i+1)+". "+list.get(i).toString());
        }
        System.out.print("번호입력: ");
        int cmd=sc.nextInt()-1;
        if(cmd<0 || cmd>= list.size()){
            System.out.println("⚠️ 유효하지 않은 번호입니다.");
            System.exit(0);
        }
        System.out.println();

        DatingCharacter selected=list.get(cmd);
        String name=selected.getName();
        if(selected.getTalkStyle().contains("반말")){
            System.out.println("["+name+"] 뭐야~ 왜 이제 왔어?");
        } else if(selected.getTalkStyle().contains("공손")){
            System.out.println("["+name+"] 오셨군요. 기다리고 있었어요.");
        }else if(selected.getTalkStyle().contains("시크")) {
            System.out.println("[" + name + "] 왔네.");
        }else{
            System.out.println("안녕.");
        }
        System.out.println();

        System.out.println("\uD83D\uDC49 무엇을 말할까요?\n" +
                "1. 오늘 좀 바빴어\n" +
                "2. 보고 싶었어\n" +
                "3. 아무 말도 하지 않는다");
        System.out.print("번호입력: ");
        cmd=sc.nextInt();
        System.out.println();

        if(cmd==1){
            System.out.println("[\"+name+\"] 흐응~ 바빴구나. 알겠어.");
        }else if(cmd==2){
            System.out.println("[\"+name+\"] 진짜? 그 말 또 해줘 \uD83D\uDE0A");
        }else if(cmd==3){
            System.out.println("[\"+name+\"] ... (가만히 쳐다본다)");
        }else{
            System.out.println("[\"+name+\"] 응? 무슨 말이야?");
        }
    }
}
