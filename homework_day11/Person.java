package homework_day11;

public class Person {
	 	private String name;
	    private int age;
	    private String country;

	    // Default constructor
	    public Person() {
	        this.name = "Unknown";
	        this.age = 0;
	        this.country = "Unknown";
	    }

	    // Constructor with one parameter
	    public Person(String name) {
	        this.name = name;
	        this.age = 0; // Default age
	        this.country = "Unknown"; // Default country
	    }

	    // Constructor with two parameters
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.country = "Unknown"; // Default country
	    }

	    // Constructor with three parameters
	    public Person(String name, int age, String country) {
	        this.name = name;
	        this.age = age;
	        this.country = country;
	    }

	    // Method to display person details
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Country: " + country);
	        System.out.println("---------------------");
	    }

	    public static void main(String[] args) {
	        // Creating objects using different constructors
	        Person p1 = new Person();
	        Person p2 = new Person("Rutuja");
	        Person p3 = new Person("Divya", 24);
	        Person p4 = new Person("Charlie", 30, "USA");

	        // Displaying the details
	        System.out.println("Person 1:");
	        p1.display();
	        
	        System.out.println("Person 2:");
	        p2.display();
	        
	        System.out.println("Person 3:");
	        p3.display();
	        
	        System.out.println("Person 4:");
	        p4.display();
	    }
	}
