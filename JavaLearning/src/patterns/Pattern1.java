package patterns;

public class Pattern1 {
 
	public static void main(String[] args) {
		
     for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(i);
				
			}
			System.out.println();  //1
			                       //22
			                       //333
			                       //4444
			                       //55555

		}
		
//            for (int i=5; i>=1; i--) {     
//			
//			for (int j=5; j>=i; j--) {
//				
//				System.out.print(i);
//				
//			}
//			System.out.println();  //5
//                                   //44
//                                   //333
//                                   //2222
//                                   //11111
//		}
	}
}
