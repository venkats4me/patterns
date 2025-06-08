package streams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class IntSteamsOperations {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("From the given list of integers, print the numbers which are multiples of 5?");
        listOfIntegers.stream().filter(i->i%5==0).forEach(System.out::println);
        System.out.println("==Given a list of integers, find maximum and minimum of those numbers?==");
        System.out.println("case 1 using min and max with Comparator");
        System.out.println("Max value = "+listOfIntegers.stream().max(Comparator.comparing(Integer::intValue)).get());
        System.out.println("Min Value = "+listOfIntegers.stream().min(Comparator.comparing(Integer::intValue)).get());
        System.out.println("Max Vaule = "+listOfIntegers.stream().min(Comparator.reverseOrder()).get());
        System.out.println("Min value = "+listOfIntegers.stream().max(Comparator.reverseOrder()).get());
        System.out.println("Max value = "+listOfIntegers.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Min value = "+listOfIntegers.stream().min(Comparator.naturalOrder()).get());
        System.out.println("case 2 simple sort with skip and find first");
        System.out.println("Max value = "+listOfIntegers.stream().sorted().skip(listOfIntegers.size() - 1).findFirst().get());
        System.out.println("Min value = "+listOfIntegers.stream().sorted().findFirst().get());
        System.out.println("case 3 sorting with reverse order skip and find first");
        System.out.println("Max value = "+listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst().get());
        System.out.println("Min value = "+listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(listOfIntegers.size()-1).findFirst().get());
        System.out.println("case 4 sorting with reverse order  with limit and find first");
        System.out.println("Max value = "+listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().get());
        System.out.println("Min value = "+listOfIntegers.stream().sorted().limit(1).findFirst().get());
        System.out.println("case 5 sorting with compare order");
        System.out.println("Max value = "+listOfIntegers.stream().sorted((o1,o2)->o2-o1).limit(1).findFirst().get());
        System.out.println("Min value = "+listOfIntegers.stream().sorted((o1,o2)->o1-o2).limit(1).findFirst().get());
        System.out.println("case 6 sorting with compareTo order");
        System.out.println("Max value = "+listOfIntegers.stream().sorted((o1,o2)->o2.compareTo(o1)).limit(1).findFirst().get());
        System.out.println("Min value = "+listOfIntegers.stream().sorted((o1,o2)->o1.compareTo(o2)).limit(1).findFirst().get());
        System.out.println(" Find second largest number in an integer array");
        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
        System.out.println(listOfIntegers.stream().sorted((o1,o2)->o2-o1).skip(1).findFirst());
        System.out.println(listOfIntegers.stream().sorted().skip(listOfIntegers.size()-2).findFirst());
        System.out.println("Given a list of strings, sort them according to increasing order of their length?");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(s->s.length())).forEach(System.out::println);
        System.out.println("Given an integer array, find sum and average of all elements?");
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println( IntStream.of(a).summaryStatistics());
        System.out.println(IntStream.of(a).sum());
        System.out.println(IntStream.of(a).average().getAsDouble());
        System.out.println(" How do you find common elements between two arrays?");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
       Stream.concat(list1.stream(), list2.stream()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .forEach((k,v)->{
                  // System.out.println(k+"==="+v);
                   if (v>1){
                       System.out.println(k);
                   }
               });

        List<Integer> listOfIntegers1 = Arrays.asList(71, 18, 42, 21, 68, 32, 95, 14, 56, 87);
        Map<String, List<Integer>> collect = listOfIntegers1.stream().collect(Collectors.groupingBy(i -> i % 2 == 0 ? "even" : "odd"));
        System.out.println(collect);
        Map<Boolean, Long> collect1 = listOfIntegers1.stream().collect(Collectors.groupingBy(e -> e % 2 == 0, Collectors.counting()));
        System.out.println(collect1);
    }
}
