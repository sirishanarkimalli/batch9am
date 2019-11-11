package basics;

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any two numbers to find the power");
		int a=s.nextInt();
		int b=s.nextInt();
		int result=1;
		for(int i=1;i<=b;i++)
			result*=a;
		System.out.println(result);

	}

}
