package homework_day12;

public class Outer {
	 // Static inner class
    static class StaticInner {
        static void showStatic() {
            System.out.println("Inside static inner class method.");
        }
    }

    // Non-static inner class
    class NonStaticInner {
        void showNonStatic() {
            System.out.println("Inside non-static inner class method.");
        }
    }

    // Static method in Outer class to access non-static inner class
    static void accessInner() {
        Outer outer = new Outer();  // Create outer class object
        outer.new NonStaticInner().showNonStatic();  // Call inner class method
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling static class
        StaticInner.showStatic();

        // Calling non-static inner class method using a static method
        accessInner();

	}

}
