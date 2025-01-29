package classwork_day11;

public class ProgrammingLanguage {
	String languageName;
	
	//parameterized constructor
	ProgrammingLanguage(String name){
		languageName = name;
	}
	//method to display language Name
	void display() {
	System.out.println("Programming Languages are:"+languageName);
	}
	
	public static void main(String[] args) {
		  // Create objects with different programming languages
        ProgrammingLanguage lang1 = new ProgrammingLanguage("Java");
        ProgrammingLanguage lang2 = new ProgrammingLanguage("Python");
        ProgrammingLanguage lang3 = new ProgrammingLanguage("C++");
        ProgrammingLanguage lang4 = new ProgrammingLanguage("JavaScript");
        ProgrammingLanguage lang5 = new ProgrammingLanguage("Ruby");

        // Displaying the names
        lang1.display();
        lang2.display();
        lang3.display();
        lang4.display();
        lang5.display();

	}

}
