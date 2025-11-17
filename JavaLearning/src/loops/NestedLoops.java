package loops;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5; i++)   //outer 2<=5 T
		{
			
			for (int j=1; j<=5; j++)     //inner 6<=5 T
			{
              System.out.print(" * ");   //inner loop body ***
                                                         //***
		    }
           System.out.println(); // outer body
	     }
	}

}