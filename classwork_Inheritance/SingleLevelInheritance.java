//. Write a program to demonstrate single level inheritance. (Take example by your own).
package classwork_Inheritance;

//Parent class
class Vehicle{
	void start() {
		System.out.println("Vehicle is Starting...");
	}
}
//child class
class Car extends Vehicle{
	void drive() {
		System.out.println("Car is Driving...");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.start();
		myCar.drive();
	}

}
