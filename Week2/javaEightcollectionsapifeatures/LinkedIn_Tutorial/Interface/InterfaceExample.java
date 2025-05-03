package Interface;

interface MyInterface {
    // Default method
    default void defaultMethod() {
        System.out.println("Default method inside Interface");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method inside Interface");
    }
}


public class InterfaceExample implements MyInterface {
    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.defaultMethod(); // Calls the default method
        
        MyInterface.staticMethod(); // Calls static method using interface name

    }
    
}
//Java 8 introduced default & static methods inside interfaces to allow functionality without breaking existing implementations.
