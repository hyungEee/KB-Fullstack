package practice.day07.ex06;


import java.util.Scanner;

import practice.day07.ex02.Celebrity;
import practice.day07.ex02.FemaleCelebrity;
import practice.day07.ex02.MaleCelebrity;
import practice.day07.ex03.FemaleMatchGame;
import practice.day07.ex03.MaleMatchGame;
import practice.day07.ex04.InvalidGenderException;

public class Main {

    static MaleCelebrity[] maleCelebs = {
            new MaleCelebrity("박서준"),
            new MaleCelebrity("차은우"),
            new MaleCelebrity("정해인"),
            new MaleCelebrity("이도현"),
            new MaleCelebrity("송강"),
            new MaleCelebrity("김선호"),
            new MaleCelebrity("안효섭"),
            new MaleCelebrity("도경수"),
            new MaleCelebrity("임시완"),
            new MaleCelebrity("이준호"),
            new MaleCelebrity("유연석"),
    };

    static FemaleCelebrity[] femaleCelebs = {
            new FemaleCelebrity("아이유"),
            new FemaleCelebrity("장원영"),
            new FemaleCelebrity("카리나"),
            new FemaleCelebrity("윈터"),
            new FemaleCelebrity("한소희"),
            new FemaleCelebrity("김세정"),
            new FemaleCelebrity("윤아"),
            new FemaleCelebrity("설현"),
            new FemaleCelebrity("제니"),
            new FemaleCelebrity("지수")
    };

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("=== 이상형 월드컵 ===\n" +
                "1. 남자 연예인 월드컵\n" +
                "2. 여자 연예인 월드컵\n" +
                "경기를 선택하세요: ");
        try{
            int num=sc.nextInt();
            sc.nextLine();
            if(num==1){
                MaleMatchGame maleGame = new MaleMatchGame(maleCelebs);
                maleGame.shuffle();
                System.out.println("\n[셔플된 참가자 명단]");
                maleGame.printCandidates();
                Celebrity[] winner=maleGame.playGame(maleGame.candidates,1);
                System.out.println("\n💗 최종 우승자: "+winner[0]);
            }
            else if(num==2){
                FemaleMatchGame femaleGame = new FemaleMatchGame(femaleCelebs);
                femaleGame.shuffle();
                System.out.println("\n[셔플된 참가자 명단]");
                femaleGame.printCandidates();
            }
            else{
                throw new InvalidGenderException(">> 잘못된 선택입니다! 1 또는 2만 입력하세요.");
            }
        }catch (InvalidGenderException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(">> 숫자만 입력하세요! (1 또는 2)");
        }

    }
}