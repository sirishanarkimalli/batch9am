package exceptionhandling;

import java.util.Scanner;

public class TryCatchDemo1 {

	public static void main(String[] args) {
		Scanner s = null;
		try {
			int a, b;
			s = new Scanner(System.in);
			System.out.println("Enter two values for division ");
			a = s.nextInt();
			b = s.nextInt();

			int div = a / b;
			System.out.println("Result: " + div);

			String s1 = "hello";// "20"
			int n = Integer.parseInt(s1);

			String name = null;
			System.out.println(name.length());

		} catch (ArithmeticException |  NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			s.close();
			System.out.println("End");
		}
	}
}
