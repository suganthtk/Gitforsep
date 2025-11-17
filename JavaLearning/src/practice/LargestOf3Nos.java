package practice;

public class LargestOf3Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 21;
        int b = 5;
        int c = 17;

        if (a >= b && a >= c)
            System.out.println(a + " is the largest");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest");
        else
            System.out.println(c + " is the largest");


	}

}
