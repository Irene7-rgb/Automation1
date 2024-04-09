package pkg3;

interface Bike{
	
	public void speedLimit();
}

class Honda implements Bike{

	@Override
	public void speedLimit() {
		System.out.println("Honda speedlimit");
		
	}
	
}

class Hero implements Bike{

	@Override
	public void speedLimit() {
		System.out.println("Hero Speedlimit");
		
	}
	
}

public class interfacePgm {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.speedLimit();

	}

}
