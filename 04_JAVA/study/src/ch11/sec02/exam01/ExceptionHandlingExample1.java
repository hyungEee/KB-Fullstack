package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try{
            int result=data.length();
            System.out.println("문자 수: "+result);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // data가 null이므로 data.length()를 호출할 수 없고, 그 결과 NullPointerException이 발생.
        System.out.println("[프로그램 종료]");
    }
}
