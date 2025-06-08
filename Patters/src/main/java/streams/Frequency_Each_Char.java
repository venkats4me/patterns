package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Frequency_Each_Char {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        System.out.println("befor java 8");
        String[] str=inputString.split("");
        Map<Character,Integer> freqMap=new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
         freqMap.put(inputString.charAt(i),freqMap.containsKey(inputString.charAt(i))?(freqMap.get(inputString.charAt(i))+1):1);
        }
        System.out.println(freqMap);
         /*IntStream.rangeClosed(0, inputString.length() - 1)
                .map(s -> inputString.charAt(s)).
                collect(Collectors.groupingBy(, Collectors.counting()));*/
        Map<Character, Long> map2 = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map2);
        System.out.println(Stream.of(inputString.split(" ")).map(s->new StringBuffer(s).reverse()).collect(Collectors.joining(" ")));
        Stream.of(inputString.split(" ")).map(s->new StringBuffer(s).reverse()).forEach(s->System.out.print(s+" "));
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        IntStream.of(array).mapToObj(i->new StringBuffer(i).reverse()).forEach(System.out::println);
    }
}
