package Week1.OOPS;

//Example: A class can implement multiple interfaces to inherit behaviors from more than one source.

interface Animal{
    void eat();

}

interface Playable {
    void play();
}

class Dog implements Animal, Playable {
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Implemented from Animal
        dog.play(); // Implemented from Playable
    }
    
}
