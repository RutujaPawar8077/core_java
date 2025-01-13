package homework_day02;

import java.util.Scanner;

public class ReactangleAreaPerimeter {
	public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        //user enter the length  of rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        // user enter  width  of rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Calculate area of reactangle
        double area = length * width;

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // 
        System.out.println("\nArea of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
 
	}
}
