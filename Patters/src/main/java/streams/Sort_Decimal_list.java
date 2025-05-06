package streams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort_Decimal_list {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> collect = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
        List<Double> sorted = decimalList.stream().sorted(Comparator.comparing(Double::doubleValue).reversed()).collect(Collectors.toList());
        System.out.println(sorted);
        List<Integer> inList = Arrays.asList(12, 23, 17, 42, 33, 71, 56, 21);
        List<Integer> collect1 = inList.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.println(collect1);
        List<String> list = Arrays.asList("Marco","Daisy","Michael","Sanya","Robin");
        List<String> collect2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect2);
    }
}
