package arraysPractice;

public class LeftDiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = {{11, 22, 33}, 
		         {44, 55, 66}, 
		         {77, 88, 22}};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i==j) {
					System.out.println(array[i][j]);
				}
				
			}
			
		}
		
		System.out.println("=================");
		
		for (int i = 2; i>=0; i--) {
			for (int j = 2; j >=0; j--) {
				if (i == j) {
					System.out.println(array[i][j]);
				}
				
			}
			
		}
		
		  

	}

}
