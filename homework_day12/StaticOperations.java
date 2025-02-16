//Write a program to create two static variables num1 and num2 and print its addition, substraction, multiplication and division by using static block.
package homework_day12;

class StaticOperations {
	// Static variables
    static int num1 = 20;
    static int num2 = 10;

    // Static block
    static {
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static block executed before main method.");
	}

}
