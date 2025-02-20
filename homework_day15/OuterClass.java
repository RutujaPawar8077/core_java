package homework_day15;

public class OuterClass {
	private class InnerClass {
        void display() {
            System.out.println("Private Inner Class");
        }
    }

    void accessInnerClass() {
        InnerClass obj = new InnerClass();
        obj.display();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OuterClass outer = new OuterClass();
	        outer.accessInnerClass();
	}

}
