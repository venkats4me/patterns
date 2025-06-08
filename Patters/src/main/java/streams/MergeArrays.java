package streams;

import java.sql.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7,8, 1};

        int[] b = new int[] {8, 3, 9, 5};
        IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().forEach(System.out::println);
        List<Integer> l1= Arrays.asList(1,2,3,4,45);
        List<Integer> l2= Arrays.asList(90,6,44,33);
        System.out.println("==========================");
        Stream.concat(l1.stream(),l2.stream()).sorted().forEach(System.out::println);
        System.out.println("merge sort without duplicates");
        IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().forEach(System.out::println);
        String s1 = "RaceCar";
        Stream.of(s1.split("")).sorted().forEach(System.out::print);
        System.out.println();
        int i = 15623;
        int sum=0;
        while(i>0){
            int rem=i%10;
            sum+=rem;
            i=i/10;
        }
        System.out.println(sum);
        Integer collect = (Integer) Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(collect);
        int j = 15623;

        Integer sumOfDigits = Stream.of(String.valueOf(j).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sumOfDigits);
    }
}
