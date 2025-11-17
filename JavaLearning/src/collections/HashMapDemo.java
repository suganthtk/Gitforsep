package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "car"); // here it will store 1 = car
		hm.put(1, "bike"); // here it will replace 1= car and it will store 1= bike
		hm.put(3, "auto");
		hm.put(null, "Cycle"); // here it will store null = Cycle
		hm.put(null, null); // here it will replace null = Cycle and it will store null= null
		
				
		System.out.println(hm);
		
		System.out.println("size:" +hm.size());
		
		System.out.println("========================");
		
		Set<Integer> keySet = hm.keySet();
		
		for (Object aa:keySet)
		{
			System.out.println(aa);
		}
		
		System.out.println("========================");

		Collection<String> values = hm.values();
		
		for (String val : values) {
			System.out.println(val);
			
		}
		
		System.out.println("=============================");
		
		Set<Entry<Integer,String>> entrySet = hm.entrySet();
		for (Entry<Integer, String> bb : entrySet) {
			System.out.println(bb);
			
		}
		
		System.out.println("=============================");

		Iterator<Entry<Integer, String>> i = entrySet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
