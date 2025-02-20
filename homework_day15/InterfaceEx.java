package homework_day15;

interface ExampleInterface {
    default void method1() {
        commonMethod();
    }

    default void method2() {
        commonMethod();
    }

    private void commonMethod() {
        System.out.println("Common code in private method");
    }
}
public class InterfaceEx implements ExampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx obj = new InterfaceEx();
	        obj.method1();
	        obj.method2(); 
	}

}
