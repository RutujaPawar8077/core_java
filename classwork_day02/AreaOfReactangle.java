package classwork_day02;

import java.util.Scanner;

public class AreaOfReactangle {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the reactangle: "); // length
		double lenght = sc.nextDouble();
		
		System.out.println("Enter the width of the reactangle: "); //width
		double width = sc.nextDouble();
		
		//calculate the area of reactangle
		double area = width*lenght;
		
		System.out.println("The area of reactangle is: "+area);
		
		
	}

}
