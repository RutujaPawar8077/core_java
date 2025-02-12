package classwork_day10;

 final class Animal {
    void sound() {
        System.out.println("Animals make sound.");
    }
}

// This will cause an error because we cannot inherit a final class
// class Dog extends Animal { 		 // ❌ Cannot extend a final class
//     void sound() {
//         System.out.println("Dogs bark.");
//     }
// }

public class TestFinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Animal obj = new Animal();
	        obj.sound();
	}

}
