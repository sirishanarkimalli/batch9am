package basics;

class Course1 {

	String name;
	int duration;
	double cost;
	
	public static String instituteName = "Sunshine";
	
	//default constructor
	 Course1() {
		name=null;
		duration=0;
		cost=0.0;
	 }
	
	 //Parameterized Constructor
	Course1(String n, int d, double c){
		name=n;
		duration =d;
		cost =c;
	}

	public void displayDetails() {
		System.out.println("Name= " + name);
		System.out.println("Duration= " + duration);
		System.out.println("Cost= " + cost);
		System.out.println("Institute=" + Course.instituteName+"\n");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Course1 c1 = new Course1("C",25,2500);
		Course1 c2 = new Course1("Java",35,4000);
		Course1 c3 = new Course1("Adv Java",45,5000);
		
		Course1 obj = new Course1();
		
		c1.displayDetails();
		c2.displayDetails();
		c3.displayDetails();
	}
}
