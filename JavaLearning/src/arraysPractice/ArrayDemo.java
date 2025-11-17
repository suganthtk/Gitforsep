package arraysPractice;

public class ArrayDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10, 20, 30, 40, 50};
		
		int length = array.length;
		
		System.out.println("Array size :" +length);
		
		for (int i=0; i<array.length; i++)  // using for loop
		{
			System.out.println(array[i]);
		}
		
		System.out.println("========================");
		
		for (int i=array.length-1; i>=0; i--) 
		{
			System.out.println(array[i]);
		}
		
		
		System.out.println("==========================");
		
		for (int aa:array) // using for each loop
		{
			System.out.println(aa);
		}

	}

}


