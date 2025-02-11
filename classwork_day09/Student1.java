// Write a parameterized constructor that initializes these variables

package classwork_day09;

public class Student1 {
	String name;
    int age;

    // Parameterized Constructor
    public Student1(String n, int a) {
        name = n;  
        age = a;  
    }

    // method student details
    public void display() {
        System.out.println("Student Name is: " + name + ", Age is: " + age);
    }

    public static void main(String[] args) {
       
        Student1 s1 = new Student1("Rutuja", 23);
        Student1 s2 = new Student1("Shweta", 25);
        Student1 s3 = new Student1("Divya", 24);

        //result
        s1.display();
        s2.display();
        s3.display();
}
}

