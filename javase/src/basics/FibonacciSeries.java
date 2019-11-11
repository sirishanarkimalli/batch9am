package basics;

//fibonacci series upto the given number
public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 1, b = 1;
		int n = Integer.parseInt(args[0]);
		if (n == 1) {
			System.out.println(a);
		} else {
			int c = 0;
			c = a + b;
			System.out.print(a+" "+b);
			while(c<n) {				
				System.out.print(" " + c);
				a = b;
				b = c;
				c = a + b;
			} 
		}
	}

}
