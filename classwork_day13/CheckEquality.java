package classwork_day13;

import java.util.Scanner;

public class CheckEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Taking four integers as input from the user
	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();
	        
	        System.out.print("Enter third number: ");
	        int num3 = scanner.nextInt();
	        
	        System.out.print("Enter fourth number: ");
	        int num4 = scanner.nextInt();

	       //condition
	        if (num1 == num2 && num2 == num3 && num3 == num4) {
	            System.out.println("Equal");
	        } else {
	            System.out.println("Not Equal");
	        }
	}

}
