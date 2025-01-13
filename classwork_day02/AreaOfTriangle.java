package classwork_day02;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base of the triangle: "); //Base
		double base = sc.nextDouble();
		
		System.out.println("Enter the height of the triangle: "); //height
		double height = sc.nextDouble();
		
		//calculate the area of the triangle
		double area = 0.5*base*height;
		
				
		System.out.println("The Area of traiangle is:"+area);

	}

}
