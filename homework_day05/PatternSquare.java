package homework_day05;

public class PatternSquare {

	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		
		//outer loop
		for(int i= 1; i<=4; i++) {
			//inner loop
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
