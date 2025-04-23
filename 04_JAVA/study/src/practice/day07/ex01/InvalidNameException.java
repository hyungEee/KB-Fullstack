package practice.day07.ex01;

public class InvalidNameException extends Exception{
    public InvalidNameException() {
    }

    public InvalidNameException(String message) {
        super(message);
    }
}
