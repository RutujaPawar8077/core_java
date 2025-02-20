package classwork_day15;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,2,3,4};
		try {
			System.out.println(num[5]);
		}catch(Exception e) {
			System.out.println("Array Index Out Of Bounds!!");
		}

	}

}
