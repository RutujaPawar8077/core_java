package classwork_day13;

public class AreaCalculator {
	// area of square
    void printArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // area of reactangle
    void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculator obj = new AreaCalculator();

       
        obj.printArea(5);  
        obj.printArea(4, 6);  

	}

}
