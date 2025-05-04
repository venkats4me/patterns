package Java8Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class Streams_1 {
    public static void main(String[] args) {
        List<Car> cars=List.of(
                new Car("seden","BMW","530",1998),
                new Car("seden","Audi","A3",2500),
                new Car("seden","Benj","E-Class",4556),
                new Car("hatchback","Skoda","Octiva",2500),
                new Car("hatchback","Hundai","TypeR",1600),
                new Car("hatchback","Kia","Seltos",1450)

        );
       // cars.stream().forEach(System.out::println);
            //to get the seden type
        cars.stream().filter(c->c.getType().equals("seden")).forEach(System.out::println);

        List<String> list = cars.stream().flatMap(c -> Stream.of(c.getModel(), c.getMake())).toList();
        System.out.println(list);
        System.out.println(cars.stream().collect(groupingBy
                (Car::getType,Collectors.counting())));
        System.out.println(cars.stream().
                collect(Collectors.partitioningBy(c->c.getType().equals("seden"))));
        System.out.println();
        //Map<Type,Map<make,engineCap>>


        Map<String, Map<String, Integer>> result = cars.stream()
                .collect(Collectors.groupingBy(
                        Car::getType,
                        Collectors.toMap(
                                Car::getMake,
                                Car::getEngineCapacity
                        )
                ));

        System.out.println(result);

        System.out.println(IntStream.of(1,2,3,4,5).reduce(1,(a,b)->a*b));

    }

}
