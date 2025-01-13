package classwork_day03;

import java.util.Scanner;

public class Arithmatic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//user to enter values
		System.out.println("Enter the First Value: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second Value: ");
		int num2 = sc.nextInt();
		
		//Arithematic operations
		int sum = num1 + num2;    //addition
		int sub = num1 - num2;     //sub
		float multi = num1 * num2;
		double division = num1 / num2;   //division
		double remainder = num1 % num2;  //modulus
		
		System.out.println("\nArithmetic Oerations:");
		System.out.println("Addition is: "+sum);
		System.out.println("Substraction is: "+sub);
		System.out.println("Multiplication is: "+multi);
		System.out.println("Division is: "+division);
		System.out.println("Modulus is: "+remainder);
		
	}

}
