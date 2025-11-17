package javaBasics;

public class VariablePractice {
	
	static int var = 10;
	
	String s = "Java";
	
	public static void m1()
	{
		String s1 = "Selenium";
		String s2 = "Test NG";
		System.out.println(s1+s2);
		System.out.println(VariablePractice.var);
	}
	
	public static void m2()
	{
		System.out.println(new VariablePractice().s+"Programming");
	}
	
	public void m3()
	{
		System.out.println(VariablePractice.var);
		System.out.println(new VariablePractice().s);
	}
	
	public void m4()
	{
		char a = 'F';
		char b =  'g';
		System.out.println(a+" "+b );
		System.out.println(new VariablePractice().s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariablePractice.m2();
		VariablePractice.m1();
		new VariablePractice().m4();
		new VariablePractice().m3();

	}
	
	static {
		System.out.println("I am Static Block");
	}
	
	{
		System.out.println("I am an Instance Block");
	}
	
	public VariablePractice()
	{
		System.out.println("Constructor");
	}

}