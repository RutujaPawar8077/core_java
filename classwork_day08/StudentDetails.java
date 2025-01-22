package classwork_day08;

import java.util.Scanner;

class Student {
    // Fields to store student details
		private String name;
		private int age;
		private int marks1, marks2, marks3;

    // Method to take personal information
	void takePersonalInfo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter student's age: ");
        age = scanner.nextInt();
    }

    // Method to take marks and calculate the average
    void takeMarksAndCalculateAverage() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Subject 1: ");
        marks1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        marks2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        marks3 = scanner.nextInt();

        // Calculate the average
        double average = (marks1 + marks2 + marks3) / 3.0;

        // Display student details and average marks
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Marks: " + average);
    }
}



public class StudentDetails {

	public static void main(String[] args) {
		// Create an object of Student class
        Student student = new Student();

        // Take personal information
        student.takePersonalInfo();

        // Take marks and calculate average
        student.takeMarksAndCalculateAverage();

	}

}
