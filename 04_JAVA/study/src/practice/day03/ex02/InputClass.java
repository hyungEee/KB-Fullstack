package practice.day03.ex02;

public class InputClass {
    public static void main(String[] args) {
        String str=Input.read("이름");
        System.out.println("입력값: "+str);
        str=Input.read("이름","홍길동");
        System.out.println("입력값: "+str);
        int num=Input.readInt("나이");
        System.out.println("입력값: "+num);
        boolean val=Input.confirm("종료할까요?");
        System.out.println("입력값: "+val);
        val=Input.confirm("종료할까요?");
        System.out.println("입력값: "+val);
    }
}
