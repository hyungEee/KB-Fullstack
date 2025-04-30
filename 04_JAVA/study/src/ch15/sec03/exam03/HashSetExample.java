package ch15.sec03.exam03;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set= new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println();
        for(String s:set){
            System.out.println(s);
        }
    }
}
