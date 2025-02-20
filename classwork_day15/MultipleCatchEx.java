package classwork_day15;

public class MultipleCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] num = {10,20,30};
			int result = num[1] / 0; //divide by o
			System.out.println("Result is "+result);
			
			//invalid index
			System.out.println(num[5]);
			
		} catch (ArithmeticException e) {
			
//			System.out.println("Cannot Divide By Zero");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index Out of Bound!");			
	
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
	}
}


