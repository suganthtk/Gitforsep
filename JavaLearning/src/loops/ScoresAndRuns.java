package loops;

public class ScoresAndRuns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		
		if (score == 0)
		{
			System.out.println("Sorry! You are Duck Out");
		}
		else if ((score>=1) && (score<50))
		{
			System.out.println("You are about to Half Century");
		}
		else if ((score>=50) && (score<100))
		{
			System.out.println("You are about to Century");
		}
		
		else if ((score>=100) && (score<=200))
		{
			System.out.println("You are about to Double Century or Double Century");
		}
		
		else {
			System.out.println("You are exceeding 200");
		}
	}

}
