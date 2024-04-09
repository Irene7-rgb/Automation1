package pkg;

public class SwapWithVariables {

	public static void main(String[] args) {
		int a=20,b=30,c;
		System.out.println("Before Swapping");
		System.out.println("The value of a="+a+" and the value of b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println("The value of a="+a+" and the value of b="+b);
	}

}
