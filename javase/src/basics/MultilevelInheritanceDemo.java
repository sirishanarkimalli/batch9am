package basics;


class GuestFaculty extends Faculty{
	
	double paypercent =0.4;
	
	GuestFaculty(String name, String email, String subjects) {
		super(name,email,subjects);
	}
	
	public double calculatePay() {
		double amount = 5000;
		return (amount *0.4);
	}
	
}
	
	
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		GuestFaculty gf= new GuestFaculty("Ram","ram@gmail.com","Ruby Programming");
		gf.display();
	}

}
