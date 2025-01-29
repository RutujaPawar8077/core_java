package classwork_day11;

public class Person {
	 // Private instance variables
    private String name;
    private int age;
    private String country;

    // Constructor to initialize Person object
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Ensuring valid age
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Getter and Setter for country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Rutu Pawar", 23, "Karad");

        // Displaying initial details
        System.out.println("Initial Details:");
        person.displayPerson();

        // Modifying details using setters
        person.setName("Divya Patil");
        person.setAge(23);
        person.setCountry("Pune");

        // Displaying updated details
        System.out.println("\nUpdated Details:");
        person.displayPerson();
    }
}

