package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapClassDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		hm.put(3, "Rob");
		hm.put(1, "Smith");
		hm.put(2, "Louis");
		
		LinkedHashMap<Integer,String> lhm= new LinkedHashMap<Integer,String>(hm);
		System.out.println("Linked Hash Map elements");
		lhm.put(3, "Rob");
		lhm.put(1, "Smith");
		lhm.put(2, "Louis");
		for(Integer key :lhm.keySet())
			System.out.println(lhm.get(key));
		
		System.out.println("TreeMap elements");
		TreeMap<Integer,String> tm= new TreeMap<Integer, String>();
		tm.put(3, "Rob");
		tm.put(1, "Smith");
		tm.put(2, "Louis");
		for(Integer key :tm.keySet())
			System.out.println(tm.get(key));
	}

}
