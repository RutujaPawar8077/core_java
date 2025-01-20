package homework_day07;

import java.util.Scanner;

public class Calculator {
	 // Function for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Function for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function for division
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        scanner.close();
    }
}


