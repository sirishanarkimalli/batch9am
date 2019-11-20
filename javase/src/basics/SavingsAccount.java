package basics;

public class SavingsAccount extends Account {

	static String ACCOUNT_TYPE = "savings account";
	double balance;

	public SavingsAccount(int acno, String accountName, String email) {
		super(acno, accountName, email);
		this.balance = 500;
	}

	public  final double withDraw(double amount) {
		balance -= amount;
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Balance: " + balance);
		System.out.println();
	}

	public static void main(String args[]) {
		SavingsAccount sa1 = new SavingsAccount(1, "james", "james@gmail.com");
		SavingsAccount sa2 = new SavingsAccount(3, "George", "george@gmail.com");

		sa1.withDraw(100);
		sa1.deposit(200);
		sa1.displayAccountDetails();
		sa2.displayAccountDetails();
		
		Account a1 = sa1;//upcasting
		SavingsAccount sa= (SavingsAccount)a1;//downcasting
		}

}
