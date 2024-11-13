package Week1.OOPS;

class Vehicle {
	int speed; int fuel; 
	void drive() {
		System.out.println("Driving at speed: " + speed); 
		}
	}
interface LandVehicle { 
	void driveOnLand(); 
	} interface AirVehicle { 
		void fly(); 
		} 
	class FlyingCar extends Vehicle implements LandVehicle, AirVehicle { 
		int numberOfWheels; int altitude;
		@Override public void driveOnLand() { 
			System.out.println("Driving on land with " + numberOfWheels + " wheels.");
			} 
		@Override public void fly() { 
			System.out.println("Flying at altitude: " + altitude); 
			}
	}

public class HybridInheritance {
    public static void main(String[] args) {
    	FlyingCar myFlyingCar = new FlyingCar(); 
    	myFlyingCar.speed = 100; 
    	myFlyingCar.fuel = 50; 
    	myFlyingCar.numberOfWheels = 4;
    	myFlyingCar.altitude = 10000;
    	myFlyingCar.drive(); 
    	myFlyingCar.driveOnLand(); 
    	myFlyingCar.fly();
    }
}
