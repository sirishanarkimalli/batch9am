package exceptionhandling;

public class AccountBalanceException extends Exception {

	public AccountBalanceException() {
		super("Balance cannot be less than Rs.100");
	}
	
	public AccountBalanceException(String msg) {
		super(msg);
	}
}
