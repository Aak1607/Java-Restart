package Week3.Day2;

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);  // [10, 20, 30]

        // Peek element = highest element
        System.out.println("Top element: " + stack.peek());  // 30

        // Pop element = remove highest element
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);  // 30
        System.out.println("Stack after pop: " + stack);  // [10, 20]

        // Check if stack is empty 
        System.out.println("Is stack empty? " + stack.isEmpty());  // false

        // Get stack size
        System.out.println("Stack size: " + stack.size());  // 2
    }
}

//A Stack is a linear data structure that follows the LIFO (Last In, First Out) principle.
// This means the last element added (or "pushed") to the stack is the first one to be removed (or "popped").