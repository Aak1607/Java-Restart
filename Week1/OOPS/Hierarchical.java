package Week1.OOPS;

//Example: Dog and Cat classes both inherit from an Animal class.

class Animal{
 void eat(){
    System.out.println("Animal is eating");
 }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("cat is meowing");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
    
}
