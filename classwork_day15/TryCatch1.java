package classwork_day15;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//		    int data = 10 / 0;
//		} catch (ArithmeticException e) {
//		    System.out.println("Exception caught: " + e);
//		} finally {
//		    System.out.println(10 / 0); // Exception in finally block
//		}
//	}
		
		try {
		    int data = 10 / 0;
		} finally {
		    System.out.println("Finally block executed.");
		}

	}
}
