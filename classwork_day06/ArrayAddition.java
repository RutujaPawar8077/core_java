package classwork_day06;

public class ArrayAddition {

	public static void main(String[] args) {
	
		 int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {6, 7, 8, 9, 10};

	        // here create the third array
	        int[] sumArray = new int[array1.length];

	        // Add elements of both arrays
	        for (int i = 0; i < array1.length; i++) {
	            sumArray[i] = array1[i] + array2[i];
	        }

	        //
	        for (int sum : sumArray) {
	            System.out.print(sum + " ");
	        }
	}

}
