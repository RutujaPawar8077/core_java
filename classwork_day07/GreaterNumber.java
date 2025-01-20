package classwork_day07;

import java.util.Scanner;

public class GreaterNumber {

	// Function to find the greater number
    public static int findGreater(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the greater number
        int greater = findGreater(num1, num2);

        // output
        System.out.println("The greater number is: " + greater);

        scanner.close();
    }

}
