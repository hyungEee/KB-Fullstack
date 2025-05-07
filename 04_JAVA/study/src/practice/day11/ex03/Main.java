package practice.day11.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Goods> giftPool = Arrays.asList(
                new Goods("메타몽 쿠션", "분홍", false),
                new Goods("메타몽 키링", "파랑", false),
                new Goods("메타몽 텀블러", "보라", true),
                new Goods("메타몽 노트북 파우치", "회색", true),
                new Goods("메타몽 인형", "분홍", false),
                new Goods("메타몽 가방", "회색", true)
        );

        Predicate<Goods> cond1=g-> g.getColor().equals("분홍");
        String sucMsg1="성공! 분홍색 굿즈를 얻었어요! \uD83C\uDF89";
        String failMsg1="실패! 분홍색 굿즈가 없어요 \uD83D\uDE22";
        printResult("이슬이",pickGifts(giftPool),cond1,sucMsg1,failMsg1);

        Predicate<Goods> cond2= Goods::isUseful;
        String sucMsg2="성공! 유용한 굿즈를 얻었어요! \uD83D\uDC4D";
        String failMsg2="실패! 유용한 굿즈가 없어요 \uD83D\uDE22";
        printResult("지우",pickGifts(giftPool),cond2,sucMsg2,failMsg2);
    }

    public static List<Goods> pickGifts(List<Goods> pool){
        List<Goods> copy = new ArrayList<>(pool);
        List<Goods> pickedGoods=new ArrayList<>();
        for(int i=0;i<2;i++){
            int rand=(int)(Math.random()*pool.size());
            pickedGoods.add(copy.get(rand));
            copy.remove(rand);
        }
        return pickedGoods;
    }

    public static void printResult(String user,List<Goods> picks,Predicate<Goods> condition,String successMsg,String failMsg){
        System.out.println("["+user+"의 뽑기 결과]");
        boolean isSuccess=false;
        for(Goods g:picks){
            if(condition.test(g)){
                isSuccess=true;
            }
            System.out.println("- "+g.getName());
        }
        if(isSuccess){
            System.out.println("→"+successMsg);
        }else{
            System.out.println("→"+failMsg);
        }
    }

}
