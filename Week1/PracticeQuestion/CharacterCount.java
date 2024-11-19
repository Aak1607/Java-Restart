package Week1.PracticeQuestion;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "hello Akhil";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Count: " + charCount);
    }
    
}
