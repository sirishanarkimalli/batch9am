package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {

	public static void main(String[] args) {
		//factory method compile.Returns the object of Pattern
		Pattern p=Pattern.compile("[a-z]+");
		
		//factory method matcher().Returns the object of Matcher.
		Matcher m=p.matcher("123bbg234nhm345k");
		while(m.find()) {
			System.out.println("start() "+m.start());
			System.out.println("end() "+m.end());
			System.out.println("group() "+m.group());
		}
		
		p=Pattern.compile("-");
		m=p.matcher("-----1234----");
		String output=m.replaceAll("*");
		System.out.println(output);

	}

}
