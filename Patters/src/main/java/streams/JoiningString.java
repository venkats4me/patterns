package streams;


import java.util.*;
import java.util.stream.Collectors;

public class JoiningString {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collect = listOfStrings.stream().collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect);
    }
}
