package collections;

	import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

	public class LinkedListDemo {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			LinkedList<Object> ll = new LinkedList<Object>();
			
			ll.add("Java");
			ll.add(123);
			ll.add(5643213216l);
			ll.add(false);
			ll.add('a');
			ll.add(null);
			ll.add("Testing");
			ll.add(3.2f);
			ll.add(15536579.635d);
			ll.add(true);
			ll.add(true);
			ll.add(27);
			ll.add(null);
			System.out.println(ll);
			
			System.out.println("size :"+ ll.size());
			
			System.out.println("=========For Loop===============");

			
			for (int i = 0; i<ll.size(); i++)
			{
				System.out.println(ll.get(i));
			}
			
			System.out.println("========For Each Loop================");
			
			for (Object aa:ll)
			{
				System.out.println(aa);
			}
			
			System.out.println("===========Iterator==================");
			
			Iterator ali = ll.iterator();
			
			while(ali.hasNext())
			{
				System.out.println(ali.next());
			}
			
			System.out.println("===========List Iterator==================");

			ListIterator li = ll.listIterator();
			
			while (li.hasNext())
			{
				System.out.println(li.next());
			}
			
			System.out.println("================");
			
			while (li.hasPrevious())
			{
				System.out.println(li.previous());
			}
			
			System.out.println("===========Descending Iterator==================");
			
			Iterator di = ll.descendingIterator();
			
			while (di.hasNext())
			{
				System.out.println(di.next());
			}

			
			
			

		}

	
}
