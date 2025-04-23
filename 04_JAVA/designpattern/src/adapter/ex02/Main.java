package adapter.ex02;

import adapter.ex01.Banner;

public class Main {
    public static void main(String[] args) {
        Print p=new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        print(new PrintBanner(new Banner("배너")));
    }

    public static void print(Print p) {
        p.printWeak();
        p.printStrong();

    }
}
