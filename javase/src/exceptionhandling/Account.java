package exceptionhandling;

public class Account {

	int acno;
	double balance = 500;
//	String accountName;
//	String email;

	public Account(int acno) {
//			,String accountName,String email ) {		
		this.acno = acno;
//		this.accountName= accountName;
//		this.email=email;
	}

	public double withDraw(double amount) throws AccountBalanceException{
//		try {
			if (balance - amount < 100) {
				AccountBalanceException obj = new AccountBalanceException("Invalid Balance");
				throw obj;
			} else {
				balance -= amount;
			}
//		} catch (AccountBalanceException ae) {
//			System.out.println(ae.getMessage());
//		}
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void displayAccountDetails() {
		System.out.println("Account num: " + acno);
		System.out.println("balance ="+balance);
//		System.out.println("Account name: " + accountName);
//		System.out.println("Email: " + email);

	}

}
