package homework_day06;

public class ArraySearchElement {

	public static void main(String[] args) {
		
		
		int[] a = {10,20,30,40,50};  //array declare +initialize
		int n= 40;                    //declare variable
		
		for(int i=0; i<a.length; i++)  //use loop for traverse 
		{
			if(a[i]==n)						//condition
			{
				System.out.println(a[i]);
			}
		}
		
		
		

	}

}
