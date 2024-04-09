package pkg;

public class SwapWithoutVariables {

	public static void main(String[] args) {
		int a=30,b=20;
		System.out.println("Before Swapping");
		System.out.println("The value of a="+a+" and the value of b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("The value of a="+a+" and the value of b="+b);

	}

}
