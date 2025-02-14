// Write a program to demonstrate Multilevel Inheritance. (Take example by your own).

package classwork_Inheritance;

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
}
 class A{
	 void m1() {
		 System.out.println("Sub class 1");
	 }
 }
 
 class B extends A{
	 void m2() {
		 System.out.println("Sub class 2");
	 }
 }
 class C extends B{
	 void m3() {
		 System.out.println("Sub class 3");
	 }
 }
 class D extends C{
	 void m4() {
		 System.out.println("Sub class 4");
	 }
 }
 
