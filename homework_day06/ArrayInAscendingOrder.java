package homework_day06;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {
		
		int []a = {2,10,50,40,6};	 	 //array declare + initialize
		
		for( int i = 0;i<a.length;i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]>a[j]) 
				{
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;						
				}
			}
		}
		for(int i:a)
		{
			System.out.print( i+ " " );
		}
	}
}
	


