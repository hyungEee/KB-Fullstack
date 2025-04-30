package ch15.sec05.exam04;

import java.util.ArrayList;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Fruit> flist=new ArrayList<>();
        flist.add(new Fruit("포도",3000));
        flist.add(new Fruit("수박",10000));
        flist.add(new Fruit("딸기",6000));

        flist.sort(new FruitComparator());
        for(Fruit f:flist){
            System.out.println(f.name+": "+f.price);
        }

    }
}
