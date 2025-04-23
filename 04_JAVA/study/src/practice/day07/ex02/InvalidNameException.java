package practice.day07.ex02;

public class InvalidNameException extends Exception{
    public InvalidNameException() {
    }

    public InvalidNameException(String message) {
        super(message);
    }
}
