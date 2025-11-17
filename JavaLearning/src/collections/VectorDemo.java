package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Vector<Object> vector = new Vector<Object>();
	   
	    vector.add("Java");
	    vector.add(123);
	    vector.add(5643213216l);
	    vector.add(false);
	    vector.add('a');
	    vector.add(null);
	    vector.add("Testing");
	    vector.add(3.2f);
	    vector.add(15536579.635d);
	    vector.add(true);
	    vector.add(true);
	    vector.add(27);
	    vector.add(null);
		System.out.println(vector);

		System.out.println("size :"+ vector.size());

		System.out.println("=========For Loop===============");

		
		for (int i = 0; i<vector.size(); i++)
		{
			System.out.println(vector.get(i));
		}
		
		System.out.println("========For Each Loop================");
		
		for (Object aa:vector)
		{
			System.out.println(aa);
		}
		
		System.out.println("===========Iterator==================");
		
		Iterator ali = vector.iterator();
		
		while(ali.hasNext())
		{
			System.out.println(ali.next());
		}
		
		System.out.println("===========List Iterator==================");

		ListIterator li = vector.listIterator();
		
		while (li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("================");
		
		while (li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		System.out.println("===========Enumeration==================");
		
		Enumeration ee = vector.elements();
		
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}
		

		
		
	}

}
