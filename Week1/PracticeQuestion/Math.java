package Week1.PracticeQuestion;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("enter the first number");
    int num1 = scan.nextInt();

    System.out.println("enter the second number");
    int num2 = scan.nextInt();

    int sum = num1+num2;
    System.out.println("addition of two number = " +sum);

    int mul =num1*num2;
    System.out.println("multiply of two number"+mul);

    int div = num1/num2;
    System.out.println("division of two number"+div);

    
    }
    
}
