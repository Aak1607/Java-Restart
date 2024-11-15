package Week1.PracticeQuestion;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int num1 = scan.nextInt();

        for(int i= 0 ; i<10 ;i++){
System.out.println(num1 + "x" +(i+1) +  "=" +(num1 * (i+1)));
        }   
     }
    
}
