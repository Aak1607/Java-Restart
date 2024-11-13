package Week1.OOPS;


//Example: A Cat class overrides the sound() method of an Animal class. The method that gets executed depends on the object type at runtime.

//Superclass
class Fruit {
 public void display() {
     System.out.println("I am a fruit");
 }
}

//Subclass
class Apple extends Fruit {
 @Override
 public void display() {
     System.out.println("I am an apple");
 }
}

public class MethodOverriding {
 public static void main(String[] args) {
     Fruit fruit = new Fruit();
     fruit.display(); // Output: I am a fruit
     
     Apple apple = new Apple();
     apple.display(); // Output: I am an apple
}
}
