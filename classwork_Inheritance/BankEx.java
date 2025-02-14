// Create a class bank. Create two methods credit() and debit() in it respectively. Create two classes Credit and Debit which extends the Bank class and call the two methods respectively in both the classes.

package classwork_Inheritance;

class Bank{
	void credit() {
		System.out.println("Amount credited to account");
	}
 
  void debit() {
	System.out.println("Amount Debited to account");
	}
}

//child class
 class Credit extends Bank{
	 void showCredit() {
		 credit();
	 }	 
 }
 class Debit extends Bank{
	 void showDebit() {
		 debit();
	 }	 
 }
 
 
public class BankEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit c = new  Credit();
		Debit d = new Debit();
		
		c.showCredit();
		d.showDebit();
	}

}

