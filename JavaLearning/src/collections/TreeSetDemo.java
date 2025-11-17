package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(3);
		ts.add(555);
		ts.add(6666);
		ts.add(621);
		ts.add(487);
		ts.add(64);
		
		System.out.println(ts);
		System.out.println("Size: "+ts.size());
		
		System.out.println("=======For each loop====");
		for (Integer aa : ts) {
			System.out.println(aa);
			
		}
		
		System.out.println("=======Iterator====");

		Iterator i = ts.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		System.out.println("=======Descending Iterator====");
 
		Iterator di = ts.descendingIterator();
		while (di.hasNext()) {
			System.out.println(di.next());
			
		}
		
		
		

		
	}

}
