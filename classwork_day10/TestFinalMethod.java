package classwork_day10;

  class Parent {
	 final void show() {
		  System.out.println("This is Final Method");
	  }	
}
  class Child extends Parent {
//	     void show() {  // Error: Cannot override final method
//	         System.out.println("Trying to override.");
//	     }
	}

public class TestFinalMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object create
		  Child obj = new Child();
	        obj.show();
	}

}
