package classwork_day14;

class Person {
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

// Subclass Student extends Person
class Student extends Person {}

// Abstract class Animal
abstract class Animal {
    abstract void makeSound(); // Abstract method

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass Dog extends Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class Main {
	public static void main(String[] args) {
        // object
        Student student = new Student();
        student.setName("Rutuja Pawar");
        System.out.println("Student Name: " + student.getName());

        //object of Dog
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }

}
