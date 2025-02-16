//Write a program to show how static methods and non-static methods can be called. (Take your own example)
package homework_day12;

public class MethodDemo {
	
	// Static method
    static void displayStatic() {
        System.out.println(" static method.");
    }
    
    // Non-static method
    void displayNonStatic() {
        System.out.println("non-static method.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Call static method
        displayStatic();

        MethodDemo obj = new MethodDemo();
        obj.displayNonStatic();
	}

}
