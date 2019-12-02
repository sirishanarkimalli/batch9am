package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ls= new LinkedList<String>();
		ls.add("Sundar Pichai");
		ls.add("Bill Gates");
		ls.add("Elon Musk");
		ls.add("Sir Gabriel");
		
		ls.addFirst("Larry Page");
		for(String name:ls)
			System.out.println(name);

		String removedName=ls.removeLast();
		
		System.out.println("\nList after removing "+removedName);
		for(String name:ls)
			System.out.println(name);

	}

}
