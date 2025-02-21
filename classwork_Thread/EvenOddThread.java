package classwork_Thread;

class EvenThread extends Thread {
    @Override
    public void run() {
    	
        System.out.println("Even numbers from 1 to 20 are:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}

public class EvenOddThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a thread object
        EvenThread evenThread = new EvenThread();
        
        // Start the thread
        evenThread.start();
        
        System.out.println("Main thread is finished.");
	}

}
