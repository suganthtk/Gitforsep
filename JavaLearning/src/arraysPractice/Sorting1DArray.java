package arraysPractice;

public class Sorting1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {45, 12, 89, 33, 22, 9};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		
		for (int a : arr) {
			System.out.print(a+" ");
			
		}

	}

}
