package pkg2;

public class GreaterThree {

	public static void main(String[] args) {
		int a=34,b=23,c=89;
		
		if(a>b && a>c) {
			System.out.println("The greatest number is :"+a);
		}
		else if(b>a && b>c) {
			System.out.println("The greatest number is :"+b);
		}
		else {
			System.out.println("The greatest number is :"+c);
		}

	}

}
