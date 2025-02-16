package homework_day12;

import java.util.Scanner;

public class Reactangle {
	
	 static class PerimeterCalculator {
	        static void calculate(int length, int width) {
	            int perimeter = 2 * (length + width);
	            System.out.println("Perimeter of Rectangle: " + perimeter);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();
        
        System.out.print("Enter width of rectangle: ");
        int width = scanner.nextInt();
        
        // Calling static method from static nested class
        PerimeterCalculator.calculate(length, width);
	}

}
