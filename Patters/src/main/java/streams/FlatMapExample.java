package streams;


import java.util.*;
import java.util.stream.*;


public class FlatMapExample {
    public static void main(String[] args) {
        List<Customer> customerList=getAll();
        List<String> collect = getAll().stream().flatMap(c -> c.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(collect);
        //Split Strings into Characters
        List<String> words = Arrays.asList("java", "code");
        //Stream<String[]> stream = words.stream().map(s -> s.split(""));
      //  stream.forEach(System.out::println);
       for (String s:words){
           for (int i = 0; i < s.length(); i++) {
               System.out.print(s.charAt(i)+" ");
           }
       }
        System.out.println("using java8");
        String collect1 = words.stream().flatMap(s -> Arrays.stream(s.split(""))).collect(Collectors.joining(","));
        System.out.println(collect1);
        List<String> jsonLines = Arrays.asList(
                "apple,banana",
                "cat,dog"
        );
        jsonLines.stream().flatMap(s->Arrays.stream(s.split(","))).forEach(System.out::print);
        System.out.println();
        List<String> collect2 = getAll().stream().flatMap(list -> list.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("List of phone numbers");
        System.out.println(collect2);
    }
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
}
