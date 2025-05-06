package streams;

import java.util.*;
import java.util.stream.Collectors;

public class SeparteOddEven {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        listOfIntegers.stream().collect(Collectors.groupingBy(i -> i % 2 == 0))
                .forEach((k,v)->
                {
                    if(k){
                        System.out.println("Even numbers");
                    }else {
                        System.out.println("Odd numbers");
                    }
                    v.stream().forEach(System.out::println);
                });


        System.out.println("by using another way");
        listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)).
forEach((k,v)->
        {
            if(k){
                System.out.println("Even numbers");
            }else {
                System.out.println("Odd numbers");
            }
            v.stream().forEach(System.out::println);
        });
    }
}
