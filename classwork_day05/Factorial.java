package classwork_day05;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//object create
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The factorial number is:");
		int number = sc.nextInt();
		
		int fact = 1;
		for(int i = number; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("the factorial of no is:"+fact);

	}

}
