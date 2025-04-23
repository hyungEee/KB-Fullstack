package practice.day07.ex03;
import practice.day07.ex02.Celebrity;
import practice.day07.ex06.VsSelectable;

import java.util.Random;
import java.util.Scanner;

public abstract class MatchGame implements VsSelectable {
    public Celebrity[] candidates;
    public abstract void initializeCandidates();
    public abstract Celebrity playGame();
    public void printCandidates(){
        for(int i=0;i<candidates.length;i++){
            System.out.println(candidates[i].toString());
        }
    }
    public void shuffle(){
        for(int i=candidates.length-1;i>0;i--){
            Random rand=new Random();
            int j= rand.nextInt(i);
            Celebrity temp=candidates[i];
            candidates[i]=candidates[j];
            candidates[j]=temp;
        }
    }

    @Override
    public Celebrity selectWinner(Celebrity c1, Celebrity c2) {
        Scanner sc=new Scanner(System.in);
        System.out.println("누가 더 이상형인가요?\n1. "+c1.getName()+"\n2. "+c2.getName());
        while(true){
            System.out.print("선택: ");
            int num=sc.nextInt();
            sc.nextLine();
            if(num==1) {
                System.out.printf("[%s 승리!]\n", c1);
                return c1;
            }
            else if(num==2) {
                System.out.printf("[%s 승리!]\n",c2);
                return c2;
            }
            else
                System.out.println("잘못된 입력입니다! 1 또는 2만 입력하세요.");
        }
    }

    public Celebrity[] playGame(Celebrity[] cans,int round){

        Celebrity[] winners;
        System.out.println("\n=== "+round+"라운드 ===");
        if(cans.length==2){
            winners=new Celebrity[]{selectWinner(cans[0], cans[1])};
        }
        else {
            if(cans.length % 2 == 1){
                winners=new Celebrity[cans.length/2+1];
            }
            else{
                winners=new Celebrity[cans.length/2];
            }
            for (int i = 0; i < cans.length - 1; i += 2) {
                winners[i / 2] = selectWinner(cans[i], cans[i + 1]);
            }
            if (cans.length % 2 == 1 && cans.length > 2) {
                winners[cans.length / 2] = cans[cans.length - 1];
                System.out.println(cans[cans.length - 1].getName() + "은(는) 자동으로 다음 라운드 진출!");
            }
            winners = playGame(winners,round+1);
        }
        return winners;
    }
}
