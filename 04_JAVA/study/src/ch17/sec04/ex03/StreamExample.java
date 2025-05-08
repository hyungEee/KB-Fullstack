package ch17.sec04.ex03;
import java.util.stream.IntStream;

public class StreamExample {
    public static int sum=0;

    public static void main(String[] args) {
        IntStream st=IntStream.rangeClosed(1,100);
        st.forEach(a->sum+=a);
        System.out.println("총합: "+sum);
    }
}
