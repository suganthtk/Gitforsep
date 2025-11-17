package arraysPractice;

public class FixedInSize {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {2, 3, 4, 5}; //Literal Way of declaring the array
		
		int size = array.length;
		
		System.out.println("Array Size "+size);
		
		
		System.out.println("Existing Array");
		
		//for(int i=0; i<=size-1; i++  
		for(int i=0; i<size; i++)
		{
			System.out.println(array[i]);
		}
		
		int newArray[] = new int[size+2]; //declaring the array using new Keyword
		
		int newElement =6;
		
		for (int i=0; i<=size-1; i++)
		{
			newArray[i] = array[i];
		}
		
		newArray[size] = newElement;
		
		int newSize = newArray.length;
		
		System.out.println("New Array with a New Element");
		
		for (int i=0; i<newSize; i++)
		{
			System.out.println(newArray[i]);
		}
		
		
	}

}

