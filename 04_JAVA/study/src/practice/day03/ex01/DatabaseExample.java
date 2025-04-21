package practice.day03.ex01;

public class DatabaseExample {
    public static void main(String[] args) {
        String dbName=Database.connect();
        System.out.println("데이터베이스: "+dbName);
        Database.close();
    }
}
