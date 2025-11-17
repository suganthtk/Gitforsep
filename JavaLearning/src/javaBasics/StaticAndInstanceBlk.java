package javaBasics;

public class StaticAndInstanceBlk {
	
	
		
		int var;             //Global Variable
		
		static {
			System.out.println("I am a Static Block");
		}
		{
			System.out.println("I am an Instance Block");
		}
		
		public StaticAndInstanceBlk()
		{
			System.out.println("I am a Constructor and I have no return Type");
		}
		
		
		public static void add()
		{
			int a=10;          //Local variable
			int b=20;
			
			System.out.println("Addition of two Number " + (a+b));
		}

		public static void sub()
		{
			int a=34;          //Local variable
			int b=44;
			System.out.println("Sub of two Number " + (a-b));
			StaticAndInstanceBlk.add(); //Method Calling 
		}
		
		public void mul()
		{
			int a=34;          //Local variable
			int b=44;
			
			System.out.println("Mul of two Number " + (a*b));
			
		}
		
		public void div()
		{
			int a=68;          //Local variable
			int b=34;
			System.out.println("Div of two Number " + (a/b));
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			StaticAndInstanceBlk.add();  //Method Calling Statement
			StaticAndInstanceBlk.sub();
			new StaticAndInstanceBlk().mul(); // new StaticAndInstanceBlk--it will print the instance blk and followed by cnstr and then it print the mul
			new StaticAndInstanceBlk().div(); // new StaticAndInstanceBlk--it will print the instance blk and followed by cnstr and then it print the div
			System.out.println(new StaticAndInstanceBlk().var); 
			// new StaticAndInstanceBlk--it will print the instance blk and followed by cnstr and then it print the global variable

		}
		
		
		
	}


