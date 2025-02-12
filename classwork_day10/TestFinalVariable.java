package classwork_day10;

public class TestFinalVariable {
	
	 final int speed = 100;
	void changeSpeed() {
		//speed = 200;        error://cannot change final variable
		System.out.println("Speed is: "+speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinalVariable obj = new TestFinalVariable();
		obj.changeSpeed();

	}

}
