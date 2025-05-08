package ch17.sec06.ex02;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5};

        Arrays.stream(intArray)
                .asDoubleStream()
                .forEach(System.out::println);
        Arrays.stream(intArray)
                .forEach(System.out::println);
    }
}
