package javaBasics;

public class ArgumentsPassing {
	
	public static void add(int a, int b, int c) //Arguments/Parameters
	{
		System.out.println(a+b+c);
	}
	public static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
	public void div(int a, int b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgumentsPassing.add(5, 6, 4);
		ArgumentsPassing.add(11, 12, 13);
		new ArgumentsPassing().div(66, 11);
		ArgumentsPassing.sub(5, 2);
		new ArgumentsPassing().mul(77, 88, 99);
		ArgumentsPassing.sub(99, 97);

	}

}