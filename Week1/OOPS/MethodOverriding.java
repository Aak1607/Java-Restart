package Week1.OOPS;

//Example: A Cat class overrides the sound() method of an Animal class. The method that gets executed depends on the object type at runtime.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();   // Animal reference but Dog object
        Animal myCat = new Cat();   // Animal reference but Cat object

        myAnimal.sound();  // Output: Animal makes a sound
        myDog.sound();     // Output: Dog barks
        myCat.sound();     // Output: Cat meows
    }
    
}
