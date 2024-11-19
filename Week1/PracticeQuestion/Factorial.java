package Week1.PracticeQuestion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");

        int input = scan.nextInt();

        // Calculate the factorial 
        long factorial = calculateFactorial(input); 

        // Display the result 
        System.out.println("The factorial of " + input + " is " + factorial); 
    } 
    
    // Method to calculate factorial 
    public static long calculateFactorial(int num) {
         if (num < 0) { 
            throw new IllegalArgumentException("Number must be non-negative."); 
        }
         long result = 1; 
         for (int i = 1; i <= num; i++) {
             result *= i; 
            } 
            return result;
    }
    
}
