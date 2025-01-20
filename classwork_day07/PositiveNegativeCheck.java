package classwork_day07;

import java.util.Scanner;

public class PositiveNegativeCheck {
	
	//
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is positive or negative
        checkNumber(num);

        scanner.close();
    }
}

