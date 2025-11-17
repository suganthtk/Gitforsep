package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    	HashSet<Object> hs = new HashSet<Object>();
	    	
			hs.add(27);
			hs.add(678646l);
			hs.add("suganth");
			hs.add(true);
			hs.add('c');
			hs.add(null);
					
			System.out.println(hs);
			
			System.out.println("size:" +hs.size());
			
			System.out.println("========For each loop================");
			
			for (Object aa:hs)
			{
				System.out.println(aa);
			}
			
			System.out.println("===========Iterator==================");
			
			Iterator ali = hs.iterator();
			
			while(ali.hasNext())
			{
				System.out.println(ali.next());
			}
			
			

	

	}

}
