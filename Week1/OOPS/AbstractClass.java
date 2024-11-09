package Week1.OOPS;

// Abstract class
abstract class Shape {
    abstract void draw(); // Abstract method (no implementation)
}

// Concrete class implementing the abstract method
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); 
    }
    
}

/*Here, Shape is an abstract class with an abstract method draw(), which is implemented by the Circle class. This allows different shapes to have their specific implementation of draw(). */