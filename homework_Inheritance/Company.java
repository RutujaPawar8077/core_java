package homework_Inheritance;

//base class
  class Manager {
	void manageWork(){
		System.out.println("Manager is Managing Work");	
	}
}
  //derived class from manager
  class TeamLeader extends Manager{
	  void leadTeam() {
		  System.out.println("Team leader is leading the team");
	  }
  }
  
  //derived class from TeamLeader
  class Employee extends TeamLeader{
	  void doWork(){
		  System.out.println("Employee is doing work");
	  }
  }

public class Company {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.manageWork();
		emp.leadTeam();
		emp.doWork();
	}

}
