package homework_day02;

import java.util.Scanner;

public class AvergaeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//user enter student name
		System.out.print("Enter the student's name: ");
        String name = sc.nextLine();

        // user enter subject marks
        System.out.print("Enter marks for Subject 1: ");
        double subject1 = sc.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = sc.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = sc.nextDouble();

        // Calculate the average
        double average = (subject1 + subject2 + subject3) / 3;

        // Display the result
        System.out.println("\nStudent Name: " + name);
        System.out.println("Average Marks: " + average);
   
    }
}
	
