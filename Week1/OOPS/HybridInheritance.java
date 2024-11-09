package Week1.OOPS;

interface Playable {
    void play();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal implements Playable {
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.play(); // Implemented from Playable
    }
}
