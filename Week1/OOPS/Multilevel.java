package Week1.OOPS;

//Example: A Dog class inherits from Animal, and a Puppy class inherits from Dog
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

    class Puppy extends Dog{
        void play(){
            System.out.println("Puppy is playing");
        }
    }

    public class Multilevel {
        public static void main(String[] args) {
            Puppy puppy =new Puppy();
            puppy.bark();
            puppy.eat();
            puppy.play();
        }
}
