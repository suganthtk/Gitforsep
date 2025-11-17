package practice;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 200;

        switch (marks / 10) {
            
            case 9: System.out.println("Grade: A"); break;
            case 8: System.out.println("Grade: B"); break;
            case 7: System.out.println("Grade: C"); break;
            case 6: System.out.println("Grade: D"); break;
            case 5: System.out.println("Grade: E"); break;
            default: System.out.println("Grade: F (Fail)");
        }

	}

}
