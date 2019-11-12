package basics;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		int a[] = { 40, 50, 32, 88, 97 };
		String names[] = { "Rahul", "John", "Rohit" };

		System.out.println("Array elemenst before sort");
		for (int value : a)
			System.out.print(value + " ");

		Arrays.sort(a);

		System.out.println("\nArray elemenst after sort");
		for (int value : a)
			System.out.print(value + " ");

		int index = Arrays.binarySearch(a, 88);
		if (index < 0)
			System.out.println("Element not found");
		else
			System.out.println("Element found at " + index);

		Arrays.sort(names);

		System.out.println("\nString array after sorting\n");
		for (String name : names)
			System.out.print(name + " ");
	}

}
