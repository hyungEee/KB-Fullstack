package practice.day07.ex03;
import practice.day07.ex02.FemaleCelebrity;
import practice.day07.ex02.MaleCelebrity;

public class Main {
    public static void main(String[] args) {
        MaleCelebrity[] maleCelebs = {
                new MaleCelebrity("박서준"),
                new MaleCelebrity("차은우"),
                new MaleCelebrity("정해인")
        };

        FemaleCelebrity[] femaleCelebs = {
                new FemaleCelebrity("아이유"),
                new FemaleCelebrity("장원영")
        };

        MaleMatchGame maleGame = new MaleMatchGame(maleCelebs);
        maleGame.printCandidates();

        FemaleMatchGame femaleGame = new FemaleMatchGame(femaleCelebs);
        femaleGame.printCandidates();
    }
}
