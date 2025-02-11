//Default Constructor with Default Values
// Modify the Student class so that it also includes a default constructor (i.e., a constructor with no parameters)
package homework_day08;

public class Student {
    String name;
    int age;

    // Default Constructor 
    public Student() {
        name = "Unknown"; 
        age = 18;          
    }

    // Parameterized Constructor
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method 
    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create object here to default constructor
        Student student1 = new Student();
        student1.display();

        // Create object here to parameterized  constructor
        Student student2 = new Student("Rutuja", 23);
        student2.display(); 
    }
}
