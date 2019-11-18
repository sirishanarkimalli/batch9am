package basics;

public class Account {
	
	int acno;
	String accountName;
	String email;
	long mobileNumber;
	
	public void displayAccountDetails() {
		System.out.println("Account num: "+acno);
		System.out.println("Account name: "+accountName);
		System.out.println("Email: " +email);
		System.out.println("Mobile Number: "+mobileNumber);
		
	}
	

}
