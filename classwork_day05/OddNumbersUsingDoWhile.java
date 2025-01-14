package classwork_day05;

public class OddNumbersUsingDoWhile {

	public static void main(String[] args) {
		int i = 1;
		do {
			if(i % 2 != 0)
			{
				System.out.println(i);
				i = i + 2;
			}
		}
		while(i <= 50);
	}

}
