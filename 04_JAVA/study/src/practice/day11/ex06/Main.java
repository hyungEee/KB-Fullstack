package practice.day11.ex06;

import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String,Message> parsed=Message::new;

        Set<String> keywords=Set.of("미안", "사랑", "소중", "고마워", "행복", "고맙", "영원", "믿어" );

        Function<Message,Integer>
    }
}
