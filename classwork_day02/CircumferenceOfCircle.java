package classwork_day02;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle: ");   //radius of circle
		double radius = sc.nextDouble();
		
		//calculate the circumference of circle
		double area = 2*Math.PI*radius;
		
		System.out.println("the circumference of circle is: "+area);
	}

}
