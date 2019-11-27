package basics;

public class StaticInitConstructorBlocks {
	
	static {
		System.out.println("In Static block");
	}
	
	{
		System.out.println("In Init1 block");
			
	}
	
	{
		System.out.println("In Init2 block");
			
	}
	StaticInitConstructorBlocks(){
		System.out.println("In Construcor block");		
	}

	public static void main(String[] args) {
		new StaticInitConstructorBlocks();
		new StaticInitConstructorBlocks();
//		new StaticInitConstructorBlocks();
//		new StaticInitConstructorBlocks();

	}

}
