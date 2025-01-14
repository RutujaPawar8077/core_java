package classwork_day05;

import java.util.Scanner;

public class UserTableUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int i = 1; 
		do {
				System.out.println(num + " * "+ i +" = " +(num * i));
				i++;
			}
		while(i<=10);
	}

}
