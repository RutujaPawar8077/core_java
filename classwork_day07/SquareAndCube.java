package classwork_day07;

import java.util.Scanner;

public class SquareAndCube {
	
	// Function to calculate the square of a number
    public static int calculateSquare(int number) {
        return number * number;
    }

    // Function to calculate the cube of a number
    public static int calculateCube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate square and cube
        int square = calculateSquare(num);
        int cube = calculateCube(num);

        // Display the results
        System.out.println("The square of " + num + " is: " + square);
        System.out.println("The cube of " + num + " is: " + cube);

        scanner.close();
    }
}