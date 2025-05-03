import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '-'; // Return '-' if no unique character found
    }




    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingChar(str);
        System.out.println("First non-repeating character: " + result);
        
    }
}
