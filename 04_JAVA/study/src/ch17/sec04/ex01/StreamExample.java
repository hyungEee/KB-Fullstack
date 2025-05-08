package ch17.sec04.ex01;


import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        for(int i=0;i<=5;i++){
            Product product=new Product(i,"상품"+i,"nice company",(int)(10000*Math.random()));
            list.add(product);
        }
        list.stream().forEach(p-> System.out.println(p.toString()));
    }
}
