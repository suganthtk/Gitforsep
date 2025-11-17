package practice;

public class Demo {
	
	static boolean a;
	double b;
	
	public static void m1() {
		
		byte d=21;
		short s=357;
		System.out.println("Add of 2 No.s :" + (d+s));
		
	}
	
    public static void m2() {
		
		int w=123456;
		short j=128;
		System.out.println("Sub of 2 No.s :" + (w-j));
		new Demo().m5();
		
	}
    
    public static void m3() {
		
		int k=56;
		int l=12;
		System.out.println("Mul of 2 No.s :" +(k*l));
		
	}
    
   public void m4() {
		
		String n="Learning";
		String b="Java";
		System.out.println("Add of 2 strings :" +(n+b));
		Demo.m1();
		
	}
   
   public void m5() {
		
		String x="Ready";
		String c="Go";
		System.out.println("Add of 2 strings :" +(x+c));
		
	}
   
   public void m6() {
		
		char v='a';
		char u='j';
		System.out.println("Add of 2 char :" +(v+u));
		Demo.m3();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo.m2();  // calling m2 method using class name
		new Demo().m4(); // calling m4 method using object creation
		new Demo().m6();  // calling m6 method using object creation
		
		System.out.println(Demo.a);  // Printing Static Global Variable using class name
		System.out.println(new Demo().b);  // Printing instance Global Variable using object creation

	}

}
