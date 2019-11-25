package exceptionhandling;

import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values for division ");
		a = s.nextInt();
		b = s.nextInt();
		
			int div = a / b;
			System.out.println("Result: " + div);
			
			String s1="hello";//"20"
			int n= Integer.parseInt(s1);
			
			String name=null;
			System.out.println(name.length());
			
		} catch (ArithmeticException ae) {
			System.out.println("Divison by zero is not defined in java");
		}catch(NullPointerException ne)		{
			System.out.println("String is not assinged any value");
		}
		catch(Exception e ) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
