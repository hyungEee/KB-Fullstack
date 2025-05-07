package ch16.sec05.ex01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person=new Person();

        //정적 메소드일 경우
        person.action(Computer::staticMethod);

        //인스턴스 메소드일 경우
        Computer com=new Computer();
        person.action(com::instanceMethod);
    }
}
