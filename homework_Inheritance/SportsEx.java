//Create a class Sports. Create two methods indoor() and outdoor() in it respectively. Create two classes Indoor and Outdoor which extends the Sports class and call the two methods respectively in both the classes.
package homework_Inheritance;


class Sports{
	void indoor() {
		System.out.println("Indoor sports: chess,badminton");
	}
	void outdoor() {
		System.out.println("OutDoor Sports: cricket ,FootBall");
	}
}
class Indoor extends Sports{ 
	void ShowIndoorGames() {
		indoor();
	}
}
class Outdoor extends Sports {
	void ShowOutdoorGames() {
		 outdoor();
	}
}


public class SportsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indoor obj = new Indoor();
		obj.ShowIndoorGames();
		
		 Outdoor obj1 = new  Outdoor();
		 obj1.ShowOutdoorGames();		
	}

}
