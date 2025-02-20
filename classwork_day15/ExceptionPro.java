package classwork_day15;

public class ExceptionPro {
	void method1() {
        int data = 10 / 0;
    }

    void method2() {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method3");
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPro obj = new ExceptionPro();
	        obj.method3();
	}

}
