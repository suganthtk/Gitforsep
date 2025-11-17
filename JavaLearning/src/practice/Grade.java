package practice;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 45;

        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else if (marks >= 45)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F (Fail)");

	}

}
