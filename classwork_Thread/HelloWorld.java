package classwork_Thread;

class HelloWorldThread extends Thread {
 @Override
 public void run() {
    
     System.out.println("Hello, World!");
 }
}
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // object
        HelloWorldThread helloThread = new HelloWorldThread();
        
        helloThread.start();
        
        System.out.println("Main thread is finished.");
	}

}
