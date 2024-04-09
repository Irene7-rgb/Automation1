package pkg2;

public class SimpleCalculator {

	public static void main(String[] args) {
		int a=50,b=30,r;
		char operator='*';
		
		switch(operator) {
		
		case '+':
			r=a+b;
			System.out.println("The result is :"+r);
			break;
		case '-':
			r=a-b;
			System.out.println("The result is :"+r);
			break;
		case '*':
			r=a*b;
			System.out.println("The result is :"+r);
			break;
		case '/':
			r=a/b;
			System.out.println("The result is :"+r);
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}

	}

}
