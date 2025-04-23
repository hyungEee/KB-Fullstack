package practice.day07.ex03;

import practice.day07.ex02.Celebrity;
import practice.day07.ex02.MaleCelebrity;

public class MaleMatchGame extends MatchGame{

    protected Celebrity[] celebs;

    public MaleMatchGame(Celebrity[] cel) {
        celebs=cel;
        initializeCandidates();
    }

    @Override
    public void initializeCandidates() {
        super.candidates=new MaleCelebrity[celebs.length];
        for(int i=0;i< celebs.length;i++){
            super.candidates[i]=celebs[i];
        }
    }

    @Override
    public void printCandidates() {
        System.out.println("[남자 연예인 월드컵 참가자 명단]");
        super.printCandidates();
    }

    @Override
    public Celebrity playGame() {
        return null;
    }

}
