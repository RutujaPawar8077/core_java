package classwork_day07;

import java.util.Scanner;

public class TrianglePerimeter {
	
	 // Function 
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three sides of the triangle
        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();

        //
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Display the result
        System.out.println("The perimeter of the triangle is: " + perimeter);

        scanner.close();
    }
}

