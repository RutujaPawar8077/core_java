package classwork_day15;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 10/0;
		}catch(Exception e) {
			System.out.println("Exception caught "+e);
		}finally {
			System.out.println("finally block is executed");
		}
	}

}
