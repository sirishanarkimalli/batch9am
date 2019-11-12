package basics;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		int a[]= {40,50,32,88,97};
		String names[]= {"Rahul","John","Rohit"};
	
		
		Arrays.sort(a);
		
		System.out.println(Arrays.binarySearch(a, 100));
		Arrays.sort(names);
		
		for(String name:names)
			System.out.print(name+" ");
		
		System.out.println();
		for(int value :a)
			System.out.print(value+" ");
	}

}
