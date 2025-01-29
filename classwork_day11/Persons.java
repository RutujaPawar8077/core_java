package classwork_day11;

public class Persons {
	String name;
	
	//default constructor
	Persons(){
	name = "Rutuja Pawar";
	}
	
	//method to display name
	void display() {
		System.out.println("My Name is:"+name);
		
	}
	public static void main(String[] args) {
		Persons p1 = new Persons();
		p1.display();

	}

}
