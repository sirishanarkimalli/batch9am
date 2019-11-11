package basics;

import java.util.Scanner;

//program to reverse a given number
public class NumberReverse {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int n=num;
		//int num=Integer.parseInt(args[0]);
		
		int r, revNum=0;
		
		while(num!=0) {
			r=num%10;
			revNum=revNum*10+r;//3
			num/=10; 
		}
		System.out.println("Original Number is "+n);
		System.out.println("Original Number is "+num);
		System.out.println("Reversed Number is "+revNum);
		if(n==revNum) 
			System.out.println("Number is a palindrome");		
		else {
			System.out.println("Number is not a palindrome");
		}
			
	}

}
