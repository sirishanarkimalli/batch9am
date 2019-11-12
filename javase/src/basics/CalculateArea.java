package basics;

public class CalculateArea {
	
	public void area(double s) {
		System.out.println("Area of square="+(s*s));
	}
	
	public void area(double l, double b) {
		System.out.println("Area of square="+(l*b));
	}
	
	public void area(double l, double b, double h) {
		System.out.println("Area of square="+(l*b*h));
	}
	
	public void average(int ... numbers) {
		double sum=0,avg=0;
		for(int value: numbers)
			sum+=value;
		avg=sum/(numbers.length);
		System.out.println("\nSum= "+sum);
		System.out.println("Average= "+avg);
	}

	public static void main(String[] args) {
		CalculateArea obj = new  CalculateArea();
		obj.area(4);
		obj.area(5,6);
		obj.area(2,4,5);
		
		obj.average(2,3);
		obj.average(3,5,7,8);
		obj.average(20,40,30,50);
	}

}
