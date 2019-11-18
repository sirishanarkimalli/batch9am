package basics;

class Course1 {

	private String name;
	private int duration;
	private double cost;

	public static String instituteName = "Sunshine";
	
	//default constructor
	Course1(){
		this(null,0,0.0);
	}

	// Parameterized Constructor
	Course1(String name, int duration, double cost) {
		this.name = name;
		this.duration = duration;
		this.cost = cost;

	}
	
	public Course1 getObject() {
		return this;		
	}
	
	public void displayDetails() {
		System.out.println(this.toString());
		System.out.println("Name= " + name);
		System.out.println("Duration= " + duration);
		System.out.println("Cost= " + cost);
		System.out.println("Institute=" + Course.instituteName + "\n");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Course1 c1 = new Course1("C", 25, 2500);
		Course1 c2 = new Course1("Java", 35, 4000);
		Course1 c3 = new Course1("Adv Java", 45, 5000);
		System.out.println(c1.toString());
		
		

		Course1 obj = new Course1();

		c1.displayDetails();
		c2.displayDetails();
		c3.displayDetails();
	}
}
