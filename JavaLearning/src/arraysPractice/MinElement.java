package arraysPractice;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,4,55,8,35,62,88};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				
				min=a[i];
				System.out.println("Minimum element in the array is:"+ min);
				
			}
			
		}

	}

}
