package classwork_day02;

import java.util.Scanner;

public class Scanners {
	
	int aa=10;   //instance variable

	static int qaaa=100; //static variable
	
//	public void display()
//	{
//		int data=20;  //local variable
//		System.out.println("Display Method");
//	}
	
	public static void main(String[]args) {
		
		  //object creation using new keyword
		//sc.display();   //method calling using object
		
		
		int a=10;
		System.out.println(a);
		
		String str="jajaj";
		System.out.println(str);
		
		boolean aa=true;
		System.out.println("boolean dt:"+aa);
		
		float f=12.01f;
		System.out.println(f);
		
		double d=19191.191d;
		System.out.println(d);
		
		 Scanner sc = new Scanner(System.in);
		 
	 
		 //Name
		  System.out.println("Enter Your Name:");
		 String name = sc.next();
		 
		 //Age
		  System.out.println("Enter your Age:");
		  int age = sc.nextInt();
		  
		  //Address
		  System.out.println("Enter your Address:");
		  String address = sc.next();
		  
		 //Mobile No
		  System.out.println("Enter your Mobile Number:");
		  long mobileno = sc.nextLong();
		  
		 System.out.println("Name is: "+name+" Age is: "+age+" Address is: "+address+" Mobile Number is:"+mobileno);
	}
}
