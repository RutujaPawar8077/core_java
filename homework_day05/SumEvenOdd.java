package classwork_day05;

public class SumEvenOdd {

	public static void main(String[] args) {
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				sumEven = sumEven + i;
			}else {
				sumOdd = sumOdd + i;
			}	
		}
		System.out.println("Sum of even numbers between 1 and 30 is:"+sumEven);
		System.out.println("Sum of odd numbers between 1 and 30 is:"+sumOdd);
	}
}
