package classwork_day08;

import java.util.Scanner;

//Class for Circle
class Circle {
 private double radius;

 // Method to calculate the area of the circle
 void calculateArea() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the radius of the circle: ");
     radius = scanner.nextDouble();
     double area = Math.PI * radius * radius; 
     System.out.println("The area of the circle is: " + area);
 }
}

//Class for Triangle
class Triangle {
 private double base, height;

 // Method to calculate the area of the triangle
 void calculateArea() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the base of the triangle: ");
     base = scanner.nextDouble();
     System.out.print("Enter the height of the triangle: ");
     height = scanner.nextDouble();
     double area = 0.5 * base * height;
     System.out.println("The area of the triangle is: " + area);
 }
}

//Class for Rectangle
class Rectangle {
 private double length, breadth;

 // Method to calculate the area of the rectangle
 void calculateArea() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the length of the rectangle: ");
     length = scanner.nextDouble();
     System.out.print("Enter the breadth of the rectangle: ");
     breadth = scanner.nextDouble();
     double area = length * breadth;
     System.out.println("The area of the rectangle is: " + area);
 }
}

public class ShapeAreas {

	public static void main(String[] args) {
		// Create instances of each shape class
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        // Calculate and display the areas
        System.out.println("Calculate the area of a Circle:");
        circle.calculateArea();
        
        System.out.println("\nCalculate the area of a Triangle:");
        triangle.calculateArea();
        
        System.out.println("\nCalculate the area of a Rectangle:");
        rectangle.calculateArea();

	}

}
