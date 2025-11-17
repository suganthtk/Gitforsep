package stringConcepts;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "I   Love    India" ;
		String s2= "So Much";
		String s3= "programming";
		System.out.println(s1);
		System.out.println(s2.hashCode());
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1.length());
		System.out.println(s2.charAt(3));
		System.out.println(s2.contains("Mu"));
		System.out.println(s1.endsWith("ve"));
		System.out.println(s1.startsWith("I"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.toCharArray());
		System.out.println(s2.isEmpty());
		System.out.println(s1.indexOf('e'));
		
		String rev = "";

		for(int i=s3.length()-1;i>=0;i--) {
		    rev = rev + s3.charAt(i);
		}
		System.out.println(rev);
	}

}
