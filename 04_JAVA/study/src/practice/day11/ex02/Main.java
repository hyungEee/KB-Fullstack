package practice.day11.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    static List<Goods> goodsList=new ArrayList<>();

    public static void main(String[] args) {
        goodsList.add(new Goods("메타몽 쿠션", "분홍", false));
        goodsList.add(new Goods("메타몽 노트북 파우치", "보라", true));
        goodsList.add(new Goods("메타몽 인형", "분홍", false));
        goodsList.add(new Goods("메타몽 가방", "회색", true));
        goodsList.add(new Goods("메타몽 키링", "파랑", false));

        printSelectedGoods("이슬이",g-> g.getColor().equals("분홍"));
        printSelectedGoods("지우", Goods::isUseful);
    }

    public static void printSelectedGoods(String user, Predicate<Goods> filter){
        System.out.println("["+user+"의 선택]");
        for(Goods good:goodsList){
            if(filter.test(good)){
                System.out.println("- "+good.getName());
            }
        }
        System.out.println();
    }
}
