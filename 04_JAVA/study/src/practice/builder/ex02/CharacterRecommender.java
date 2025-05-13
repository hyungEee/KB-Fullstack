package practice.builder.ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterRecommender {
    public static void main(String[] args) {
        Map<String,DatingCharacter> keywords=new HashMap<>();
        keywords.put("다정함",DatingCharacter.builder()
                .name("지민")
                .personality("다정하고 감성적임")
                .hobby("춤")
                .favoriteFood("떡볶이")
                .talkStyle("부드럽고 공손함")
                .build());
        keywords.put("도도함",DatingCharacter.builder()
                .name("제니")
                .personality("도도하지만 배려심 있음")
                .hobby("여행")
                .favoriteFood("파스타")
                .talkStyle("털털한 반말")
                .build());
        keywords.put("조용함",DatingCharacter.builder()
                .name("태연")
                .personality("조용하지만 리더십 있음")
                .hobby("독서")
                .favoriteFood("마라탕")
                .talkStyle("단호하지만 상냥함")
                .build());

        Scanner sc=new Scanner(System.in);
        System.out.println("\uD83D\uDC49 어떤 성격의 캐릭터를 선호하시나요?\n→ 다정함 / 도도함 / 조용함 중 하나를 입력해주세요.");
        System.out.print("입력: ");
        String personality=sc.nextLine();

        if(!keywords.containsKey(personality)){
            System.out.println("해당 스타일의 캐릭터는 준비 중입니다.");
            return;
        }

        System.out.println("\n[✨ 추천 결과 ✨]");
        System.out.println(keywords.get(personality));
    }
}
