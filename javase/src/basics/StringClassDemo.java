package basics;

public class StringClassDemo {

	public static void main(String[] args) {
		String s1= new String("Java Programming");
		
		String s2 ="C";
		String s3=s1;
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("g"));
		System.out.println(s1.concat(" Language"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		

	}

}
