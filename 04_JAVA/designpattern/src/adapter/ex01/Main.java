package adapter.ex01;

public class Main {
    public static void main(String[] args) {
        print(new PrintBanner("Hello Banner!"));
    }

    // 고정된 사용자측 코드, 수정 불가
    public static void print(Print p) {
        p.printWeak();
        p.printStrong();
    }

}
