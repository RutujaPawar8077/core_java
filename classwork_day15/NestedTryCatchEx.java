package classwork_day15;

public class NestedTryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int[] numbers = {1, 2, 3};
            try {
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid index!");
            }
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Division by zero!"); 
        }
	}
}
