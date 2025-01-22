package classwork_day08;


//Class for C language
	class Clanguage {
 // Method to display C language details
		void displayInfo() {
     System.out.println("C is a procedural programming language.");
 }

 // Method to demonstrate a feature of C
		void demonstrateFeature() {
     System.out.println("C supports pointers.");
 }
}

//Class for C++ 
	class CPP {
 // Method to display C++ 
		void displayInfo() {
     System.out.println("C++ is an object-oriented programming language.");
 }

 // Method to demonstrate a feature of C++
		void demonstrateFeature() {
     System.out.println("C++ supports classes and inheritance.");
 }
}

//Class for Java
	class Java {
 // Method to display Java
		void displayInfo() {
     System.out.println("Java is a platform-independent, object-oriented programming language.");
 }

 // Method to demonstrate a feature of Java
		void demonstrateFeature() {
     System.out.println("Java supports multithreading.");
 }
}

public class ProgrammingLanguages {

	public static void main(String[] args) {
		// Create instances of each class
        Clanguage cLanguage = new Clanguage();
        CPP cpp = new CPP();
        Java java = new Java();

        // Call methods of C language
        cLanguage.displayInfo();
        cLanguage.demonstrateFeature();

        // Call methods of C++
        cpp.displayInfo();
        cpp.demonstrateFeature();

        // Call methods of Java
        java.displayInfo();
        java.demonstrateFeature();

	}

}
