package classwork_day05;

import java.util.Scanner;

public class UserTableUsingWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number:");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + " * "+ i +" = " +(num * i));
			
		}

	}

}
