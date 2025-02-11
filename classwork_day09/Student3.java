// Add a method (for example, displayInfo()) to print the student's name and age.
package classwork_day09;

public class Student3 {
	    String name;
	    int age;

	    // Parameterized Constructor
	    public Student3(String n, int a) {
	        name = n;  
	        age = a;   
	    }

	    // Method 
	    public void displayInfo() {
	        System.out.println("Student Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        Student3 s1 = new Student3("Aashish", 23);
	        Student3 s2 = new Student3("Dhanraj", 21);

	        //display result
	        s1.displayInfo();
	        s2.displayInfo();
	    }
	}





