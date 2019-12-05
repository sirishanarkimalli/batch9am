package regularexpressions;


import java.util.Scanner;
import java.util.regex.Pattern;

public class RedExpDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter mobile number: ");
		String mobileNum=s.nextLine();
		
		if(Pattern.matches("\\d{10}", mobileNum))
			System.out.println("Valid Mobile Number");
		else 
			System.out.println("Invalid Mobile Number");
	}

}
