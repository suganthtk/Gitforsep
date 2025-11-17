package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		   
		   lhs.add("Testing");
		   lhs.add(222);
		   lhs.add(79865232864l);
		   lhs.add('s');
		   lhs.add(false);
		   
		   System.out.println(lhs);
		   System.out.println("size:" +lhs.size());
		   
		   System.out.println("=====For each loop======");
		   for (Object aa : lhs) {
			   System.out.println(aa);
			
		}
		   
		   System.out.println("===Itertor=====");
		   
		   Iterator i = lhs.iterator();
		   while (i.hasNext()) {
			   System.out.println(i.next());
			
		}
	}
	}


