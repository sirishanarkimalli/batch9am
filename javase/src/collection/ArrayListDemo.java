package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("Data Science");

		Object objectAtIndex = al.get(1);
		System.out.println(objectAtIndex + " is at index 1");
		System.out.println("Index of Java " + al.indexOf("Java") + "\n");

		for (String obj : al) {
			System.out.println(obj);
		}

		al.remove(0);
		System.out.println("After removing first element");
		for (String obj : al) {
			System.out.println(obj + " is at index " + al.indexOf(obj));
		}
	}

}
