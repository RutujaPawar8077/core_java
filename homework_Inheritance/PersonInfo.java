package homework_Inheritance;


class Person{
	void getFirstName() {
		System.out.println("My First Name is: Rutuja");
	}
	void getLirstName() {
		System.out.println("My Last Name is: Pawar");
	}	
}
class PersonDetails extends Person{
	void  ShowFirstName() {
		getFirstName();		
	}
	void showLastName() {
		getLirstName();
}
}

public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails p = new PersonDetails();
		p.ShowFirstName();
		p. showLastName();
	}

}
