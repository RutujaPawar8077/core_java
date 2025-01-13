package homework_day03;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//object create
		Scanner sc = new Scanner(System.in);

		// user enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // condition 
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
