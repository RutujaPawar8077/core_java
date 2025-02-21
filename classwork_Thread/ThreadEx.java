package classwork_Thread;

class MyThread extends Thread {
    @Override
    public void run() {
        // This code will run in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from MyThread - Count: " + i);
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create thread object
        MyThread myThread = new MyThread();
        
        // Starting the thread
        myThread.start();
        
        // Main thread continues executing
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Main - Count: " + i);
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
	}

}
