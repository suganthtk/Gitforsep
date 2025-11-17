package arraysPractice;

public class MemoryWastage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[1000];  // Fixing the size as 1000
		
		array[0] =87;
		array[1] = 67; 
		 
		//for array[2,3....] it will store the value as 0
		
		for (int i=0; i<1000; i++)
		{
			System.out.println(array[i]);
		}

	}

}
