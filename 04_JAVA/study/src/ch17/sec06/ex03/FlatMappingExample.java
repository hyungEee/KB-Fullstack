package ch17.sec06.ex03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList< >();
        list1.add("this is java");
        list1.add("i am a best developer");
        list1.stream()
                .flatMap(s->Arrays.stream(s.split((" "))))
                .forEach(System.out::println);

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                .flatMapToInt(s->{
                    String[] strArr=s.split(",");
                    int[] intArr=new int[strArr.length];
                    for(int i=0;i<strArr.length;i++)
                        intArr[i]=Integer.parseInt(strArr[i].trim());
                    return Arrays.stream(intArr);
                })
                .forEach(System.out::println);

    }
}
