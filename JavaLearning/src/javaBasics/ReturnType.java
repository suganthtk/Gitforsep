package javaBasics;

public class ReturnType {
	
	public static int add(int a, int b, int c) // Arguments/Parameters passing
	{
		return a+b+c;
	}
	
	public static int sub(int a, int b)
	{
		return a-b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int addValue = ReturnType.add(5, 6, 2);
		System.out.println(addValue);
		int subValue = ReturnType.sub(15, 6);
		System.out.println(subValue);
		int Value = (addValue+subValue);
		System.out.println(Value);
		int Value1 = (addValue-subValue);
		System.out.println(Value1);
		
		int Value2 = (addValue*subValue);
		System.out.println(Value2);
		int Value3 = (addValue/subValue);
		System.out.println(Value3);
		
		

	}

}
