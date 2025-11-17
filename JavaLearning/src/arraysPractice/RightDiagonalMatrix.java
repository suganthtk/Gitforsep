package arraysPractice;

public class RightDiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][] = {{11, 22, 33}, 
		         {44, 55, 66}, 
		         {77, 88, 22}};
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i+j==array.length-1) {
					System.out.println(array[i][j]);
				}
				
			}
			
		}
	}

}
