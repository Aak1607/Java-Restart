package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "Java", "C++", "Python", "Java");

        // Count occurrences of each word
        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
    }
}
//The Collectors class provides utilities for processing collections efficiently
// groupingBy() groups elements by key.✔ counting() counts occurrences.
