package classwork_day15;

import java.util.Scanner;

public class DivisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Number1: ");
			int Num = sc.nextInt();
			
			System.out.println("Enter Number2: ");
			int Num2 = sc.nextInt();
			
			
			int result = Num/Num2;
			System.out.println("Result is "+result);
			
		}catch(Exception e) {
			System.out.println("Cannot divide by 0");
		}finally {
            //Always executes
            System.out.println("Closing resources...");
}
	}
}
