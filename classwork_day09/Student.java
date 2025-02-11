//Basic Parameterized Constructor

//Create a Student class with two instance variables: name (of type String) and age (of type int).

package classwork_day09;

public class Student {
	String name;
	int age;
	
	//Parameterized constructor
	public Student(String n,int a) {
		name = n;
		age = a;			
	}
    //student details method
	public void display() {
		System.out.println("Name is: "+ name +  ",Age is: "+ age);
	}

	public static void main(String[] args) {
		//object 
		Student student1 = new Student("Rutuja Pawar",23);
		student1.display();
		

	}

}
