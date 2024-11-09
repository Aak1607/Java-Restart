package Week1.OOPS;
//Example: The add() method is overloaded in the Calculator class to handle both two and three parameters.

class Calculator{
    // Method Overloading: Same method name, different parameter types
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));      // Output: 5
        System.out.println(calc.add(2, 3, 4));   // Output: 9
    }
    
}
