// Create a class Student. Create three classes PersonalDetails, AcademicDetails.

package classwork_Inheritance;

//Parent class
class Student{
	void stud() {
		System.out.println("Hello Everyone i am student");
	}
}
//child class
class PersonalDetails extends Student{
	void pd() {
		System.out.println("Here show My Personal Details");
	}
}
//child class
class AcedemicDetails extends PersonalDetails{
	void AD() {
		System.out.println("Here show All Acedemics");
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcedemicDetails a = new AcedemicDetails();
		a.stud();
		a.pd();
		a.AD();
	}

}
