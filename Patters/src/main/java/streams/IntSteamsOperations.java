package streams;
import java.util.*;
import java.util.stream.Stream;

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

    }
}
