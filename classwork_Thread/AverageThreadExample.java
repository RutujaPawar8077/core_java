package classwork_Thread;


class AverageThread extends Thread {
    
    private int[] marks;
    
    public AverageThread(int[] marks) {
        this.marks = marks;
    }
    
    @Override
    public void run() {
       
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        
        // Calculate the average
        double average = (double) sum / marks.length;
        
        System.out.println("Average of student marks: " + average);
    }
}


public class AverageThreadExample {
    public static void main(String[] args) {
      
        int[] studentMarks = {85, 90, 78, 92, 88};
           
        AverageThread averageThread = new AverageThread(studentMarks);
        
        averageThread.start();
        
        System.out.println("Main thread is finished.");
    }
}
