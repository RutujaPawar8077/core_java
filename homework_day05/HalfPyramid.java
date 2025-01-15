package homework_day05;

public class HalfPyramid {

	public static void main(String[] args) {
	int n = 5;
	
	//outer loop
	for(int i = 1; i<=n; i++) {
		//inner loop
		for(int j= 1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
