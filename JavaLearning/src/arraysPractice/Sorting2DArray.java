package arraysPractice;

public class Sorting2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = {{5, 6, 7}, 
		{3, 22, 11, 99},
        {42, 43, 65, 11, 1},
		{4, 1}};

		for (int i =0; i<array.length; i++) //1<4 T
		{
			for (int j=0; j<array[i].length; j++) //0< 4 T
			{
				for (int k=0; k<array[i].length-1-j; k++) //1 < 3 F
				{
					if (array[i][k]>array[i][k+1])//array[1][1]22>11array[1][2]
					{
						int temp = array[i][k];
						array[i][k] = array[i][k+1];
						array[i][k+1]= temp;
					}
				
			    }
		    }
	   }
			
		for (int i =0; i<array.length; i++)
		{
			for (int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	
	}

}
