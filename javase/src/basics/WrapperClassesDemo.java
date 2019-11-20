package basics;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		Integer intObj = new Integer(10);//Wrapping is boxing
		
		int value= intObj.intValue();//Unwrapping is unboxing

		Integer intObj1= 20;//autoboxing
		
		int value2= intObj1;//autounboxing
	}

}
