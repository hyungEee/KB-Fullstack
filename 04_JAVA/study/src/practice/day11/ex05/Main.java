package practice.day11.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        ToIntFunction<Goods> discounted= Goods::getDiscountedPrice;
        BinaryOperator<Integer> plus=(a,b)->a+b;

        int total=0;
        List<Goods> goodsList1= new ArrayList<>();
        goodsList1.add(new Goods("메타몽 쿠션",20000,0.1));
        goodsList1.add(new Goods("메타몽 키링",8000,0.05));
        goodsList1.add(new Goods("메타몽 인형",15000,0.2));
        System.out.println("[이슬이의 장바구니]");
        for(Goods g:goodsList1){
            System.out.println("- "+g.getName()+": "+g.getDiscountedPrice()+"원");
            total=plus.apply(total,discounted.applyAsInt(g));
        }
        System.out.println("총합: "+total+"원\n");

        total=0;
        List<Goods> goodsList2=new ArrayList<>();
        goodsList2.add(new Goods("메타몽 노트북 파우치",30000,0.2));
        goodsList2.add(new Goods("메타몽 가방",40000,0.2));
        System.out.println("[지우의 장바구니]");
        for(Goods g:goodsList2){
            System.out.println("- "+g.getName()+": "+g.getDiscountedPrice()+"원");
            total=plus.apply(total,discounted.applyAsInt(g));
        }
        System.out.println("총합: "+total+"원\n");
    }
}
