package ch15.sec05.exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> plist=new ArrayList<>();
        plist.add(new Person("홍길동",35));
        plist.add(new Person("김자바",25));
        plist.add(new Person("박지원",31));

        Collections.sort(plist);

        for(Person p:plist){
            System.out.println(p.name+": "+ p.age);
        }
    }
}
