package classwork_day13;

public class PrintNumber {

    void printn(int num) {
        System.out.println("Integer: " + num);
    }

  
    void printn(float num) {
        System.out.println("Float: " + num);
    }


    void printn(double num) {
        System.out.println("Double: " + num);
    }

  
    void printn(long num) {
        System.out.println("Long: " + num);
    }

 
    void printn(short num) {
        System.out.println("Short: " + num);
    }

  
    void printn(byte num) {
        System.out.println("Byte: " + num);
    }

 
    void printn(char ch) {
        System.out.println("Character: " + ch);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber obj = new PrintNumber();

       
        obj.printn(10);          
        obj.printn(10.5f);       
        obj.printn(20.56);       
        obj.printn(10000000000L);
        obj.printn((short) 5);   
        obj.printn((byte) 2);    
        obj.printn('A');    
	}

}
