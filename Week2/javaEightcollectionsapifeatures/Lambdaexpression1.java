package Week2.javaEightcollectionsapifeatures;

//A Java program to demonstrate the working of a lambda expression with two arguments. 


@FunctionalInterface
interface FuncInter1 {
    int operation(int a, int b);
}

public class Lambdaexpression1 {
    public static void main(String[] args) {
        // Using lambda expressions to define the operations
        FuncInter1 add = (a, b) -> a + b;
        FuncInter1 multiply = (a, b) -> a * b;

        // Using the operations
        System.out.println(add.operation(9, 3));  // Output: 12
        System.out.println(multiply.operation(4, 5));  // Output: 20
    }
}
