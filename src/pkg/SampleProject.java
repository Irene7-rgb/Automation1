package pkg;

public class SampleProject {

	public static void main(String[] args) {
		
		int a=56,b=20;
		
		System.out.println("The value of a+b="+(a+b));
		System.out.println("The value of a-b="+(a-b));
		System.out.println("The value of a*b="+(a*b));
		System.out.println("The value of a/b="+(a/b));
		System.out.println("The value of a%b="+(a%b));
		
		int c=b;
		System.out.println("The value of c="+c);
		System.out.println((a+=b));
		System.out.println("The value of a+b="+(a-=b));

	}

}
