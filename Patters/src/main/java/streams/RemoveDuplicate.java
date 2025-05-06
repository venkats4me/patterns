package streams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
    listOfStrings.stream().distinct().forEach(System.out::println);
        System.out.println("another method1");
        listOfStrings.stream().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println();
        System.out.println("another method2 using groupingBy");
        listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->{
                    System.out.println(k);
                });

        System.out.println("another method3 using ");



    }
}
