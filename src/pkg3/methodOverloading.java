package pkg3;

public class methodOverloading {
	
	public void add() {
		
		int a=34,b=56,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a, double b) {
		
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b) {
		double c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		methodOverloading m=new methodOverloading();
		m.add();
		m.add(20, 30);
		m.add(56, 23.2);
		m.add(58.5, 12);

	}

}
