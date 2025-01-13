package classwork_day02;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //create a Scanner object
		
		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		
		//calculate the area of circle
		double area = Math.PI*radius*radius;
		
		System.out.println("The Area of Circle is: "+area);
		
//		sc.close();
		
				
	}

}
