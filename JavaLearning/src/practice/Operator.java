package practice;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 12 ;
        int num2 = 5;
        
        char operator = '*';
        
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
	}

}
