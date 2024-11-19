package Week1.PracticeQuestion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scan.nextLine();

        String reserved = new StringBuilder(input).reverse().toString();
        System.out.println("resversed string = "+reserved);
    }
    
}
