package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAdvancedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15, 18);

        // Filter even numbers & Square them
        List<Integer> squaredEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Squared Even Numbers: " + squaredEvens);

    }
    
}
//✔ filter() removes elements that don’t meet the condition.✔ map() transforms each element by squaring it.
