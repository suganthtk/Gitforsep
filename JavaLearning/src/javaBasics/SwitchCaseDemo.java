package javaBasics;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 150;
		
//		switch(score)
//		{
//		case 0: System.out.println("You are Duck Out"); break;
//		case 50: System.out.println("You scored Half Century"); break;
//		case 100: System.out.println("You scored Century"); break;
//		case 200: System.out.println("You scored Double Century"); break;
//		default: System.out.println("Runs");		
//		
//		}
		
		if (score == 0)
		{
			System.out.println("You are Duck Out");
		}
		else if (score == 50)
		{
			System.out.println("You scored Half Century");
		}
		
		else if (score == 100)
		{
			System.out.println("You scored Century");
		}
		
		else if (score == 200)
		{
			System.out.println("You scored Double Century");
		}
		
		else
		{
			System.out.println("Runs");
		}

	}

}
