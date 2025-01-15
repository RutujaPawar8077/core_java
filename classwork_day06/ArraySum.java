package classwork_day06;

public class ArraySum {

	public static void main(String[] args) {
		 // Define an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to store sum
        int sum = 0;

        // Loop
        for (int number : numbers) {
            sum = sum + number; // 
        }

        System.out.println("The sum of array elements is: " + sum);

	}

}
