package classwork_day05;

public class SumOfThreeDigit {

	public static void main(String[] args) {
		int num = 135;
		int sum=0;
		
		while(num > 0) 
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of digit of given number:"+sum);

	}

}
