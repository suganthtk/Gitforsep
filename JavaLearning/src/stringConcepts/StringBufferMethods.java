package stringConcepts;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1= new StringBuffer("I   Love    India" );
		StringBuffer s2= new StringBuffer("So Much");
		
		System.out.println(s1.length());
		System.out.println(s1.append(s2));
		System.out.println(s2.hashCode());
		System.out.println(s2.equals(s1));
		System.out.println(s1.reverse());
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
