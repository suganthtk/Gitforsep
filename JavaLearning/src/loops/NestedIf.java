package loops;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 20;
		int b = 38; 
		
		
		if (a == 20)  //Outer if 
		{
			if (b == 34) // Inner else 
			{
				System.out.println("a is 20 and b is 34");
			}
			else {
				System.out.println("a is 20 but b is not 34");
			}
		}
		else 
		{
			System.out.println("a is not 20");
		}

	}

}
