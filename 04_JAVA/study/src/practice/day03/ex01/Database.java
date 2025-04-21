package practice.day03.ex01;

public class Database {
    private static String connection="MySQL";
    private static Database database=new Database();

    private Database(){
    }

    public static String connect() {
        System.out.println(connection +"에 연결합니다");
        return connection;
    }
    public static void close(){
        System.out.println(connection +"을 닫습니다");
    }
}
