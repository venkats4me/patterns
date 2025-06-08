package Java8Streams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class JavaStreamsExamples {
    public static void main(String[] args) {
        List<Integer> intList=Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        System.out.println("===== Given a list of integers, separate odd and even numbers?==========");
        System.out.println("logic 1");
        Map<String,List<Integer>> MaplList=intList.stream().collect(Collectors.groupingBy(i->i%2==0?"even":"odd"));
        System.out.println("logic 1"+MaplList);
        System.out.println("logic 2");
        List<Integer> evenList = intList.stream().filter(i->i%2==0).toList();
        List<Integer> oddList = intList.stream().filter(i->i%2!=0).toList();
        System.out.println("even="+evenList+","+"odd="+oddList);
        System.out.println("logic 3");
        Map<Boolean, List<Integer>> collect = intList.stream().collect(Collectors.partitioningBy(j -> j % 2 == 0));
         collect.forEach((k,v)->{

             if(!k){
                 System.out.print("Odd values is");
                 System.out.println(v);
             }else{
                 System.out.print("even values is");
                 System.out.println(v);
             }
        });
        collect.forEach((k,v)->{
            System.out.println((k?"even":"Odd")+":"+v);
        });
        collect.entrySet().stream().forEach(e->
                System.out.println(e.getKey()+":"+e.getValue()));

        System.out.println("======How do you remove duplicate elements from a list using Java 8 streams?=============");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println("=========logic 1=========");
        listOfStrings.stream().distinct().forEach(System.out::println);
        System.out.println("=======logic 2========");
       listOfStrings.stream().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("========logic 3=============");
        listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().forEach(s->System.out.println(s.getKey()));
        System.out.println("========How do you find frequency of each character in a string using Java 8 streams?======");
        System.out.println("==========Logic 1==========");
        String inputString = "Java Concept Of The Day";
        inputString.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().forEach(s->System.out.println(s.getKey()+" : "+s.getValue()));

        System.out.println("=====Split the string into words and convert to List===========");
        Arrays.stream(inputString.split(" ")).toList().forEach(System.out::println);
        System.out.println("==========");
        List<Character> list = inputString.chars().mapToObj(c -> (char) c).toList();
        System.out.println(list);
        System.out.println("====== Convert all words to lowercase=======");
        List<String> LowerString=Arrays.stream(inputString.split(" ")).map(String::toLowerCase).toList();
        System.out.println(LowerString);
        System.out.println("====== Convert all words to Upper case=======");
        List<String> UpperString=Arrays.stream(inputString.split(" ")).map(String::toUpperCase).toList();
        System.out.println(UpperString);
        System.out.println("=====Sort words alphabetically=============");
        Arrays.stream(inputString.split(" ")).sorted().forEach(System.out::println);
        System.out.println("===== How do you find frequency of each element in an array or a list=======");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> stationeryMap = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(stationeryMap);
        System.out.println("======How do you sort the given list of decimals in reverse order?======");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("==============");
        decimalList.stream().sorted((o,p)->Double.compare(p,o)).forEach(System.out::println);







    }

}
