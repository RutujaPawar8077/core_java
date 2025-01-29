package homework_day11;

public class Circle {
	 // Private instance variable
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive. Setting default value to 1.");
            this.radius = 1;
        }
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius with validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        // Creating a Circle object with radius 5
        Circle circle = new Circle(5.0);

        // Displaying initial circle details
        System.out.println("Initial Circle Details:");
        circle.display();

        // Modifying radius using setter
        circle.setRadius(7.5);

        // Displaying updated circle details
        System.out.println("\nUpdated Circle Details:");
        circle.display();
    }
}

