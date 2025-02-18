package homework_day14;
 
 class  Person{
	
	private String name;
	protected int age;
	
	
	//default method to set details
	void setDetails(String n, int a) {
		this.name = n;
		this.age = a;
		
	}
	
	//public method to display info
	public void displayInfo() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
	}
}
	
	//Subclass extends here person
	class Student extends Person {
		void showDetails() {
			
//			System.out.println("Name is "+name);   // cannot access becoz of private
			System.out.println("Age is "+age);     //here access bcoz protected
			
			displayInfo();
		} 
	}

	 public class Mains {
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sc = new Student();
		sc.setDetails("Rutuja Pawar",23);
		sc.displayInfo();
			}
	 }

