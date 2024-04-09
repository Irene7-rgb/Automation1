package pkg2;

public class methodPgms {

	public static void main(String[] args) {
		
		methodPgms mp=new methodPgms();
		mp.areaTriangle();
		System.out.println("The area of Rectangle is:"+mp.areaRectangle());
		mp.areaSquare(5);
		System.out.println("The area of Circle is:"+mp.areaCircle(2));

	}
	
	
	public void areaTriangle() {
		
		double area;
		int b=4,h=13;
		area=0.5*b*h;
		System.out.println("The area of triangle is:"+area);
	}
	
	public int areaRectangle() {
		
		int l=4,b=5,Rarea;
		Rarea=l*b;
		return Rarea;
		
	}
	
	public void areaSquare(int a) {
		
		int Sarea;
		Sarea=a*a;
		System.out.println("The area of Square is:"+Sarea);
	}
	
	public double areaCircle(int r) {
		
		double Carea=3.14*r*r;
		return Carea;
		
	}

}
