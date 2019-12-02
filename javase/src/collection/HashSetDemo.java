package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(74);
		hs.add(31);
		hs.add(2);

		for (Integer val : hs)
			System.out.println(val);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(5);
		lhs.add(74);
		lhs.add(31);
		lhs.add(2);
		lhs.add(60);
		System.out.println();
		for (Integer val : lhs)
			System.out.println(val);
		
		

		
	}

}
