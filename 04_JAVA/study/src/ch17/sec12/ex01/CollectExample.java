package ch17.sec12.ex01;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList< >();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        //1. 남학생만 뽑아내기
//        // 1-1. for문 사용하는 경우
//        List<Student> maleList=new ArrayList<>();
//        for(Student student:totalList){
//            if(student.getSex().equals("남")){
//                maleList.add(student);
//            }
//        }

        // 1-2. 스트림을 사용하는 경우
        List<Student> maleList = totalList.stream()
                .filter(s->s.getSex().equals("남"))
                .toList();
        // 결과 출력 1
        maleList //.stream() 굳이 스트림으로 변환 안해도 바로 maleList 출력 가능함(대신 중간처리는 x)
                .forEach(s-> System.out.println(s.getName()));
        // 결과 출력 2
        maleList.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        // 2. 점수 내림차순으로 정렬 후, 상위 2개를 뽑아내어 List에 저장하기
        List<Student> topList=totalList.stream()
                .sorted((a,b)->Integer.compare(b.getScore(),a.getScore()))
                .limit(2)
                .toList();
        topList.forEach(System.out::println);

        // 3. 학생 이름을 키, 학생 점수를 값으로 갖는 Map 생성
        Map<String,Integer> map=totalList.stream()
                .collect(
                        Collectors.toMap(
                                s->s.getName(),
                                s->s.getScore()
                        )
                );
        System.out.println(map);
    }
}
