package classwork_day11;

public class Rectangle {
	// Attributes for width and height
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        // Creating a Rectangle object with width and height
        Rectangle rect = new Rectangle(10.5, 5.2); // Example values

        // Displaying details
        rect.display();
    }
}

