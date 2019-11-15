package basics;

import java.util.StringJoiner;

public class StringJoinerClassDemo {

	public static void main(String[] args) {
		StringJoiner sj= new StringJoiner("," , "[" ,"]" );
		sj.add("India");
		sj.add("Australia");
		sj.add("USA");
		System.out.println(sj.toString());
		

	}

}
