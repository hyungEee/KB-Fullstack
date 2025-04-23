package practice.day07.ex04;

import java.util.Scanner;
import practice.day07.ex02.FemaleCelebrity;
import practice.day07.ex02.MaleCelebrity;
import practice.day07.ex03.FemaleMatchGame;
import practice.day07.ex03.MaleMatchGame;

public class Main {

    static MaleCelebrity[] maleCelebs = {
            new MaleCelebrity("박서준"),
            new MaleCelebrity("차은우"),
            new MaleCelebrity("정해인")
    };

    static FemaleCelebrity[] femaleCelebs = {
            new FemaleCelebrity("아이유"),
            new FemaleCelebrity("장원영")
    };

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("=== 이상형 월드컵 ===\n" +
                "1. 남자 연예인 월드컵\n" +
                "2. 여자 연예인 월드컵\n" +
                "경기를 선택하세요: ");
        try{
            int num=sc.nextInt();
            if(num==1){
                MaleMatchGame maleGame = new MaleMatchGame(maleCelebs);
                maleGame.printCandidates();
            }
            else if(num==2){
                FemaleMatchGame femaleGame = new FemaleMatchGame(femaleCelebs);
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
