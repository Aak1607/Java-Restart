package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Example of using Stream API to filter and print even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Using Stream API to filter even numbers and print them
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
    
}
//The Stream API allows functional-style operations on collections like filtering, mapping, and reducing.
// It provides a more concise and readable way to process collections compared to traditional loops.