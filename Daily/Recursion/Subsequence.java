package Recursion;

public class Subsequence {
    public static void generateSubsequences(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }
        generateSubsequences(input.substring(1), output);        // Exclude current character
        generateSubsequences(input.substring(1), output + input.charAt(0)); // Include current character
    }

    public static void main(String[] args) {
        String str = "abc";
        generateSubsequences(str, "");
    }
    
}
