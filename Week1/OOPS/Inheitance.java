package Week1.OOPS;

//Parent class
class FortunerCar {
 protected String brand;

 public void drive() {
     System.out.println("Vehicle is being driven");
 }
}

//Child class inheriting from Vehicle
class Car extends FortunerCar {
 private int year;

 public Car(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 public void displayInfo() {
     System.out.println("Brand: " + brand + ", Year: " + year);
 }
}

public class Inheitance {
	public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        myCar.displayInfo(); // Output: Brand: Toyota, Year: 2020
        myCar.drive(); // Output: Vehicle is being driven
    }

}
