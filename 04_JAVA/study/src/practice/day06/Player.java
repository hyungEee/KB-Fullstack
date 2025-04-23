package practice.day06;

public class Player {
    public void logTitle(String title) {

        class Logger {
            String t=title;  // ❗ title이 가려짐

            public void print() {
                System.out.println("제목: " + t);
            }
        }

        Logger logger = new Logger();
        logger.print();
    }

    public static void main(String[] args) {
        new Player().logTitle("사건의 지평선");
    }
}
