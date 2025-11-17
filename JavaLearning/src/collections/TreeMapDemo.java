package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		   tm.put(1,"Testing");
		   tm.put(2,"Manual");
		   tm.put(3,"Manual");
		   tm.put(1,"Selenium");
		   
		   
		   System.out.println(tm);
		   System.out.println("size:" +tm.size());
		   
		   System.out.println("========================");
			
			Set<Integer> keySet = tm.keySet();
			
			for (Object aa:keySet)
			{
				System.out.println(aa);
			}
			
			System.out.println("========================");

			Collection<String> values = tm.values();
			
			for (String val : values) {
				System.out.println(val);
				
			}
			
			System.out.println("=============================");
			
			Set<Entry<Integer,String>> entrySet = tm.entrySet();
			for (Entry<Integer, String> bb : entrySet) {
				System.out.println(bb);
				
			}
			
			System.out.println("=============================");

			Iterator<Entry<Integer, String>> i = entrySet.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			System.out.println("=============================");

			
			 
				
			
			

	}
	

}
