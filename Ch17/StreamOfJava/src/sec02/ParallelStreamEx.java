package sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> parallelStream = list.parallelStream();
        parallelStream.forEach(num -> {
            System.out.println(num + ":" +  Thread.currentThread().getName());
        });
    }
}
