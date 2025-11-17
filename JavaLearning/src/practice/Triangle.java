package practice;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 22;
        int b = 33;
        int c = 44;

        if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");

	}

}
