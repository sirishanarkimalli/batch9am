package basics;

public class BitwiseOperatorsTest {

	public static void main(String[] args) {
		byte a=4, b=2;
		System.out.println("Bitwise And of "+a+" "+b+"="+(a&b));
		System.out.println("Bitwise OR of "+a+" "+b+"="+(a|b));
		System.out.println("Bitwise XOR of "+a+" "+b+"="+(a^b));
		System.out.println("left shift of "+a+" "+b+"="+(a<<b));
		System.out.println("right shift of "+a+" "+b+"="+(a>>b));
		System.out.println("right shift of "+a+" "+b+"="+(a>>>b));
	}

}
