package practice.day07.ex04;

public class InvalidGenderException extends Exception{
    public InvalidGenderException() {
    }

    public InvalidGenderException(String message) {
        super(message);
    }
}
