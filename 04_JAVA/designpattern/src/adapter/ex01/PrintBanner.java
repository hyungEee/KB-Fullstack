package adapter.ex01;

public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    // 기존에 구현된 코드를 다른 이름으로 Wrapping.
    @Override
    public void printWeak() {
        showWithParen();
    }
    @Override
    public void printStrong() {
        showWithAster();
    }

}
