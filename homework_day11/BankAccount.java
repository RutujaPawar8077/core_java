package homework_day11;

public class BankAccount {
	// Private instance variables
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance (ensuring no negative balance)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("123456789", 5000.00);

        // Displaying initial account details
        System.out.println("Initial Account Details:");
        account.displayAccountInfo();

        // Modifying account details using setters
        account.setBalance(7000.50);
        account.setAccountNumber("987654321");

        // Displaying updated account details
        System.out.println("\nUpdated Account Details:");
        account.displayAccountInfo();
    }
}

