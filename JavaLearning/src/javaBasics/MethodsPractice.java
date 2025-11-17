package javaBasics;

public class MethodsPractice {
	
	int var;                 // instance Global Variable
	static String s;        // Static global variable
	
	
	
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
		
		MethodsPractice.add();  //Method Calling Statement
		MethodsPractice.sub();
		
		MethodsPractice obj = new MethodsPractice(); //  obj creation for instance method
		obj.mul(); // calling  non static method using obj ref
		obj.div();
		
		
		System.out.println("Global Variable Value:" + obj.var);  // print default value
		
		obj.var=20;  // initializing instance global variable using obj ref
		
		System.out.println("Global Variable Value:" + obj.var);  //print 20
		
		System.out.println(MethodsPractice.s);  // print default value
		
		MethodsPractice.s="sugu";  // initializing static global variable using classname
		System.out.println(MethodsPractice.s);  // print sugu

		
		// obj.s="sugu"; // initializing static global variable using obj ref
		//Even though you’re using the object reference (obj),you’re still modifying the class-level variable s.
        //In Java, all static variables are shared by every object of that class.
		//Both obj.s and MethodsPractice.s refer to the same memory location.
		
		//System.out.println(obj.s);  // print sugu
		
		
		
	}
	
	
	
}
