package practice.day07.ex03;

import practice.day07.ex02.Celebrity;
import practice.day07.ex02.FemaleCelebrity;

public class FemaleMatchGame extends MatchGame{

    protected Celebrity[] celebs;

    public FemaleMatchGame(Celebrity[] cel) {
        celebs=cel;
        initializeCandidates();
    }

    @Override
    public void initializeCandidates() {
        super.candidates=new FemaleCelebrity[celebs.length];
        for(int i=0;i< celebs.length;i++){
            super.candidates[i]=celebs[i];
        }
    }

    @Override
    public void printCandidates() {
        System.out.println("[여자 연예인 월드컵 참가자 명단]");
        super.printCandidates();
    }

    @Override
    public Celebrity playGame() {
        return null;
    }
}