package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1=new Korean("박자바","011225-1234567");
        Korean k2=new Korean("김자바","930525-0654321");
        System.out.println("k1.nation: "+k1.nation+"\nk1.name: "+k1.name+"\nk1.ssn: "+k1.ssn+'\n');
        System.out.println("k2.nation: "+k2.nation+"\nk2.name: "+k2.name+"\nk2.ssn: "+k2.ssn);
    }
}
