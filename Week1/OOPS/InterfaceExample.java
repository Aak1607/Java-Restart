package Week1.OOPS;

interface Animal {
    void makeSound();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}

