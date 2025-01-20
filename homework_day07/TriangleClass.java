package homework_day07;

import java.util.Scanner;

public class TriangleClass {
	// Function
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height 
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        // Calculate the area
        double area = calculateArea(base, height);

        // 
        System.out.println("The area of the triangle is: " + area);


    }
}



