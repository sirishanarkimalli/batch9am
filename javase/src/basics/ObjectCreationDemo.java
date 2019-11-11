package basics;

public class ObjectCreationDemo {
	
	public void fibonacciSeries(int n) {
		int a = 1, b = 1;
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

	public static void main(String[] args) {
		ObjectCreationDemo obj= new ObjectCreationDemo();
		int n = Integer.parseInt(args[0]);
		
		obj.fibonacciSeries(n);
		

	}

}
