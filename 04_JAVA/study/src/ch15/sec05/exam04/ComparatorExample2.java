package ch15.sec05.exam04;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorExample2 {
    public static void main(String[] args) {
        ArrayList<Fruit> flist=new ArrayList<>();
        flist.add(new Fruit("포도",3000));
        flist.add(new Fruit("수박",10000));
        flist.add(new Fruit("딸기",6000));

        flist.sort(new Comparator<Fruit>(){
            @Override
            public int compare(Fruit f1, Fruit f2){
                return Integer.compare(f1.price, f2.price);
            }
        });
        for(Fruit f:flist){
            System.out.println(f.name+": "+f.price);
        }
    }
}
