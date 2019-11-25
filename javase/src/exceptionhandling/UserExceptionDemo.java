package exceptionhandling;

public class UserExceptionDemo {

	public static void main(String[] args) throws AccountBalanceException{
		Account a = new Account(1);
		a.displayAccountDetails();
//		try {
		a.withDraw(800);
//		}catch(AccountBalanceException ae) {
//			System.out.println(ae.getMessage());
//			ae.printStackTrace();
//		}
		a.displayAccountDetails();
	}

}
