package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("Java");
		al.add(123);
		al.add(5643213216l);
		al.add(false);
		al.add('a');
		al.add(null);
		al.add("Testing");
		al.add(3.2f);
		al.add(15536579.635d);
		al.add(true);
		al.add(true);
		al.add(27);
		al.add(null);
		System.out.println(al);

		System.out.println("size :"+ al.size());

		System.out.println("=========For Loop===============");

		for (int i = 0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("========For each loop================");
		
		for (Object aa:al)
		{
			System.out.println(aa);
		}
		
		System.out.println("===========Iterator==================");
		
		Iterator ali = al.iterator();
		
		while(ali.hasNext())
		{
			System.out.println(ali.next());
		}
		
		System.out.println("===========List Iterator==================");

		ListIterator li = al.listIterator();
		
		while (li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("================");
		
		while (li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
