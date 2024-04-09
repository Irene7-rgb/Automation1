package pkg3;


abstract class Car{
	
	abstract public void speedLimit();
	
	public void color() {
		System.out.println("Red");
	}
}

class BMW extends Car{

	@Override
	public void speedLimit() {
		
		System.out.println("BMW");
	}
	
}

class Benz extends Car{

	@Override
	public void speedLimit() {
		System.out.println("Benz");
		
	}
	
}

public class abstractPgm {

	public static void main(String[] args) {
	
		Benz b=new Benz();
		b.speedLimit();
		b.color();
		
		
	}

}
