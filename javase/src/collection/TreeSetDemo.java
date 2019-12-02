package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<Integer>();
		ts.add(49);
		ts.add(2);
		ts.add(38);
		ts.add(82);
		ts.add(1);
		
		for(Integer val : ts)
			System.out.println(val);
		
		SortedSet<Integer> beforeValues=ts.headSet(38);
		System.out.println();
		for(Integer val : beforeValues)
			System.out.println(val);
		System.out.println();
		SortedSet<Integer> afterValues=ts.tailSet(38);
		for(Integer val : afterValues)
			System.out.println(val);
		
	}

}
