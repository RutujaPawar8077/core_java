//Write a method to display the student details, and in the main method, create a Student object using the default constructor and display its details.

package homework_day08;

public class Student2 {
	    String name;
	    int age;

	    // Default Constructor 
	    public Student2() {
	        name = "Unknown";  
	        age = 18;          
	    }

	    // Method 
	    public void displayDetails() {
	        System.out.println("Student Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        // Create object here to default constructor
	        Student2 student1 = new Student2();
	        
	        // Display result
	        student1.displayDetails();  
	    }
	}

	