package pkg3;

public class accessModifiersPgm {
	
	private int a=10;
	int b=5;
	protected int c=80;
	public int d=78;

	public static void main(String[] args) {
		
		accessModifiersPgm ac=new accessModifiersPgm();
		System.out.println(ac.a);
		System.out.println(ac.b);
		System.out.println(ac.c);

	}

}
