package arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,4,3,4,5};
        Arrays.stream(a).boxed().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println(IntStream.of(a).sum());
        System.out.println(IntStream.rangeClosed(1,50).sum());
        List<String> names=Arrays.asList("Venkat","basa","sappu","basa");

      names.stream().distinct().forEach(System.out::print);

        Stream<String> stream = Stream.generate(()->"stream").limit(5);
        stream.forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(i->System.out.print(i+")stream"));

        Stream<Integer> stream1 = Stream.iterate(10,n->n*2).limit(5);
        stream1.forEach(System.out::println);
        Stream.iterate("*", s -> s.length() <= 5, s -> s + "*")
                .forEach(System.out::println);

        List<Integer> l1=Arrays.asList(3,5,6,73,8);
        List<Integer> l2=Arrays.asList(88,55,22,99,90);
        List<Integer> l3=Arrays.asList(33,22,12,45,76,81);
        List<Integer> collect = Stream.of(l1, l2, l3).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(collect);

    }
}
