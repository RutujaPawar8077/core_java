package classwork_day09;

public class Student4 {
	
	    String name;
	    int age;

	    // Parameterized Constructor
	    public Student4(String n, int a) {
	        name = n;  
	        age = a;   
	    }

	    // Method 
	    public void display() {
	        System.out.println("Student Name is: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        // Here create object
	        Student4 student1 = new Student4("Rutuja", 23);

	        // display result
	        student1.display();
	    }
	}

