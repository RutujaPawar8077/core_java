package homework_day15;

class Parent1 {
    protected void display() {
        System.out.println("Protected method in Parent");
    }
}

class Child extends Parent1 {
    @Override
    public void display() {
        System.out.println("Overridden method in Child");
    }
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
        obj.display();
	}

}
