package arraysPractice;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 25, 3, 78, 45, 90, 12};
        
        int max = arr[0];   // assume first element is the maximum
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // compare each element
                max = arr[i];    // update max if current element is greater
            }
        }
        
        System.out.println("Maximum element in the array is: " + max);

	}

}
