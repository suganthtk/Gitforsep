package arraysPractice;

public class TwoDim {
	
	public static void main(String[] args) {
		
		int a[] []= { {2,3,4,5},
		{10,20},
		{11,22,33,44},
		{6,66,666}
		
		};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("=============");
		
		for (int[] array : a) {
			
			for (int b : array) {
				System.out.print(b+" ");
				
			}
			System.out.println();
			
		}
	}

}
