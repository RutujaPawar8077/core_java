package classwork_Inheritance;

//GrandParent class
class GrandParent{
	void showGrandParent() {
		System.out.println("This is GrandParent class");
	}
}
//Parent class inherits Grandparent
class Parent extends GrandParent{
	void showParent() {
		System.out.println("This is Parent class");
	}
}
//Child class inherits parent
class Child extends Parent{
	void showChild() {
		System.out.println("This is Child class");
	}
}


public class FamilyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.showGrandParent();
		obj.showParent();
		obj.showChild();
	}

}
