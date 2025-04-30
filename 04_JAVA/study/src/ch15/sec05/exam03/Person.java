package ch15.sec05.exam03;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>{
    public String name;
    public int age;

    @Override
    public int compareTo(Person p) {
        if(age> p.age){
            return 1;
        } else if(age< p.age){
            return -1;
        }else{
            return 0;
        }
    }
}
