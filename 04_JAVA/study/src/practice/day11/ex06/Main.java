package practice.day11.ex06;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Function<String,Message> parsed=Message::new;

        Set<String> keywords=Set.of("미안", "사랑", "소중", "고마워", "행복", "고맙", "영원", "믿어" );

        Function<Message,Integer> calcScore=m->{
            int score=0;
            for(String k:keywords){
                if(m.getContent().contains(k)){
                    score+=30;
                }
                if(score>100){
                    score=100;
                    break;
                }
            }
            return score;
        };

        Predicate<Message> filter;

        Consumer<Message> printer;

    }
}
