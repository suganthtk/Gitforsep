package exceptionHandling;

public class RuntimeDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		int b = 0;
		
		try {
		System.out.println(a/b);
		}
	
		catch (ArithmeticException e) {
			System.out.println("Infinity");
		}
		
		catch (Exception e) {
			System.out.println("Infinity3");
		}
		
		finally {
			System.out.println("Executed");
		}

	}

}


