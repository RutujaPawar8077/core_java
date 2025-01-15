package classwork_day06;

public class ArraySearch {

	public static void main(String[] args) {
		int[] array = {5, 10, 15, 20, 25};

  
        int target = 15;

        // Loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
          
                System.out.println("Element " + target + " found at position: " + (i + 1));
                return;
            }
        }

        System.out.println("Element " + target + " not found in the array.");

	}

}
