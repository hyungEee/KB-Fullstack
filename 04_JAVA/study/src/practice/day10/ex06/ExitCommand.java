package practice.day10.ex06;

public class ExitCommand implements Command{
    @Override
    public void execute() {
        System.out.println("👋 프로그램을 종료합니다.");
        System.exit(0);
    }
}
