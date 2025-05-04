package Java8Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExa {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 4, -5, 67, 8);

        IntStream intStream = IntStream.of(1, 4, 5, 67, 8);
        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        IntStream range = IntStream.range(1, 10);
        Stream.Builder<String> jai = Stream.<String>builder().add("jai").add("Hanuman.....");
       jai.build().forEach(System.out::println);
        List<Car> cars=List.of(
                new Car("seden","BMW","530",1998),
                new Car("seden","Audi","A3",2500),
                new Car("seden","Benj","E-Class",4556),
                new Car("hatchback","Skoda","Octiva",2500),
                new Car("hatchback","Hundai","TypeR",1600),
                new Car("hatchback","Kia","Seltos",1450)

        );
        System.out.println(cars.stream().count());
        System.out.println("most engine capacity");
        System.out.println(cars.stream().max(Comparator.comparing(Car::getMake)).get());
        System.out.println(stream.reduce(0,Integer::sum));
        System.out.println(Stream.of(58,-85,99,41).reduce(0,Integer::max));
        System.out.println(Stream.of(58,-85,99,41).reduce(0,Integer::min));
        Stream<Integer> stream1 = Stream.of(25, 85, 45, 96, 32, 87);
        //System.out.println(stream1.anyMatch(i->i%5!=0));
       //. stream1.close();
        System.out.println(stream1.allMatch(i->i%5==0));
        System.out.println(cars.stream().collect(Collectors.toSet()));
        System.out.println("==============");
       Stream.generate(()->"Jai Hanuman").limit(10).forEach(System.out::println);
       IntStream.rangeClosed(1,10).forEach(i->System.out.println(i+")Jai Hanuman..."));
       Stream.iterate(0,n->n+1).limit(11).collect(Collectors.toList()).forEach(System.out::println);
        Stream.iterate(0,n->n+1).limit(5).forEach(System.out::print);
        Stream<Car> peek = cars.stream().peek(System.out::print);
        System.out.println(peek.collect(Collectors.toList()));
    }
}
