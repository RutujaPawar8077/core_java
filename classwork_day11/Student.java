package classwork_day11;

public class Student {
	double subject1, subject2;
	
	//parameterized constructor
	Student(double s1,double s2){
		subject1 = s1;
		subject2 = s2;
	}
	
	//method to calculate the display average
	void calculateAverage() {
		double average = (subject1 + subject2)/2;
		System.out.println("Average Marks: " +average);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(90.0, 85.7);
		s1.calculateAverage();
		

	}

}
