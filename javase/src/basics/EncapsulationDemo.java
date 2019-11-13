package basics;

class Course {

	String name;
	int duration;
	double cost;
	public static String instituteName = "Sunshine";

	public void displayDetails() {
		System.out.println("Name= " + name);
		System.out.println("Duration= " + duration);
		System.out.println("Cost= " + cost);
		System.out.println("Institute=" + Course.instituteName);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Course c1 = new Course();// instantiation
		Course c2 = new Course();
		Course c3 = new Course();
		System.out.println(Course.instituteName);

		c1.name = "C";
		c1.duration = 25;
		c1.cost = 2500;

		c2.name = "Java";
		c2.duration = 35;
		c2.cost = 3500;

		c3.name = "Python";
		c3.duration = 40;
		c3.cost = 4500;

		c1.displayDetails();
		c2.displayDetails();
		c3.displayDetails();

	}

}
