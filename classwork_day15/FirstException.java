package classwork_day15;

public class FirstException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int [] arr = {1,2,3};
			System.out.println(arr[5]);
			
		}catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("Invalid index");
				
		}

	}

}
