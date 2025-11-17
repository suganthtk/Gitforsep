package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		   lhm.put(1,"Testing");
		   lhm.put(2,"Manual");
		   lhm.put(3,null);
		   lhm.put(null,"Selenium");
		   lhm.put(null,null);
		   
		   System.out.println(lhm);
		   System.out.println("size:" +lhm.size());
		   
		   System.out.println("========================");
			
			Set<Integer> keySet = lhm.keySet();
			
			for (Object aa:keySet)
			{
				System.out.println(aa);
			}
			
			System.out.println("========================");

			Collection<String> values = lhm.values();
			
			for (String val : values) {
				System.out.println(val);
				
			}
			
			System.out.println("=============================");
			
			Set<Entry<Integer,String>> entrySet = lhm.entrySet();
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
