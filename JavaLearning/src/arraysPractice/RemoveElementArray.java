package arraysPractice;

public class RemoveElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {5,10,15,20,25};
		int size = a.length;
		System.out.println("Array size:"+size);
		
		for (int cc : a) {
			System.out.println(cc);
			
		}

		
		int newArray[]= new int[size-1];
		
		for (int i = 0; i <size-1; i++) {
			newArray[i]= a[i];
			
		}
		
		System.out.println("New Array size:"+ newArray.length);
		
		for (int bb : newArray) {
			System.out.println(bb);
			
		}
		

	}

}
