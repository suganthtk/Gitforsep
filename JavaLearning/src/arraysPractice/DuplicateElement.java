package arraysPractice;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {1, 5, 2, 3, 5, 1, 7, 2, 9};
		 System.out.print("Duplicate ELement is:" );
		 for (int i = 0; i < arr.length; i++) {
			 for (int k = i+1; k < arr.length; k++) {
				 if (arr[i]==arr[k]) {
					 
					 System.out.print(arr[i] +", ");
					 
			}	 
				
			}
			
		}

	}

}
