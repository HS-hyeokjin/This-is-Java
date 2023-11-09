package sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("K", 10),
                new Student("H", 10),
                new Student("J", 10));

/*
        //방법1
        Stream<Student> studentStream = list.stream();
        //중간처리
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        //최종처리(평균 점수)
        double avg = scoreStream.average().getAsDouble();
*/

        //방법2
        double avg = list.stream()
                .mapToInt(Student -> Student.getScore())
                .average()
                .getAsDouble();


        System.out.println("평균 : " + avg);
    }


}
