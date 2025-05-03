package Streams;

import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        // Using Stream API to filter and print names that start with 'A'

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
    
}
//Uses stream() to process collections ✔ Applies filter() to select elements ✔ Uses forEach() for printing results
