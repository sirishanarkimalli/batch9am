package basics;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		boolean t=true,f=false;
		
		System.out.println(t&f);
		System.out.println(t|f);
		System.out.println(t^f);
		System.out.println((t&f)&&(t|f));
		System.out.println((t&t)||(t|f));
	}

}
