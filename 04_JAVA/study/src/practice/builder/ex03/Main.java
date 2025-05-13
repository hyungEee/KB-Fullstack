package practice.builder.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<DatingCharacter> list=new ArrayList<>();
        list.add(DatingCharacter.builder()
                .name("지민")
                .personality("다정하고 감성적임")
                .typeCode("S")
                .build());
        list.add(DatingCharacter.builder()
                .name("수지")
                .personality("순수한 첫사랑 느낌")
                .typeCode("S")
                .build());
        list.add(DatingCharacter.builder()
                .name("민호")
                .personality("무뚝뚝한 츤데레")
                .typeCode("T")
                .build());
        list.add(DatingCharacter.builder()
                .name("태연")
                .personality("조용하지만 리더십 있음")
                .typeCode("T")
                .build());
        list.add(DatingCharacter.builder()
                .name("제니")
                .personality("도도하지만 배려심 있음")
                .typeCode("C")
                .build());

        Scanner sc=new Scanner(System.in);
        System.out.println("\uD83D\uDC98 어떤 유형의 캐릭터를 보고 싶나요?\n→ S (순수형), T (츤데레형), C (차도남/차도녀형)");
        System.out.print("입력: ");
        String type=sc.nextLine();
        List<CharacterType> filteredList=list.stream()
                .filter(c->c.getTypeCode().equals(type))
                .collect(Collectors.toList());

        System.out.println("[해당 유형 캐릭터 목록]");
        for(int i=0;i<filteredList.size();i++){
            System.out.println((i + 1) + ". " + filteredList.get(i));
        }
    }
}
