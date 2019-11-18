package basics;

public class SavingsAccount extends Account{
	
	static String ACCOUNT_TYPE="savings account";
	double balance=500;
	

	
	public double withDraw(double amount) {
		balance-= amount;
		return balance;
	}
	
	public void deposit(double amount) {
		balance+= amount;
	}
	
	public static void main(String args[]) {
		SavingsAccount sa1 = new SavingsAccount();
		sa1.acno=001;
		sa1.accountName="James";
		sa1.email="james@gmail.com";
		sa1.mobileNumber=998878877;
		
		sa1.withDraw(100);
		sa1.deposit(200);
		sa1.displayAccountDetails();
		
		
	}

}
