// In the default constructor, initialize name to a default value (like "Unknown") and age to a default value (for example, 18).

package homework_day08;

public class Student1 {

	    String name;
	    int age;

	    // Default Constructor 
	    public Student1() {
	        name = "Unknown";  
	        age = 18;          
	    }

	    // Parameterized Constructor 
	    public Student1(String n, int a) {
	        name = n;
	        age = a;
	    }

	    // Method
	    public void display() {
	        System.out.println("Student Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        //  Create object here to default constructor
	        Student1 student1 = new Student1();
	        student1.display(); 

	        // Create object here to parameterized constructor
	        Student1 student2 = new Student1("Rutuja", 23);
	        student2.display();
	    }
	}
