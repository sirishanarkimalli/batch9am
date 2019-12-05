package regularexpressions;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d");
		//split on space
		String[] items=p.split("one9two1three8four2five");
		for(String s : items)
			System.out.println(s);
	}

}
