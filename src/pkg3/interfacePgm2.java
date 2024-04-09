package pkg3;

interface basicAnimal{
	
	void eat();
	void sleep();
}

class monkey{
	
	public void jump() {
		System.out.println("Jump");
	}
	public void bite() {
		System.out.println("Bite");
	}
	
	
}
class human extends monkey implements basicAnimal{

	
	public void speak() {
		System.out.println("Speak");
	}
	@Override
	public void eat() {
		System.out.println("Eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep");
		
	}
	
}

public class interfacePgm2 {

	public static void main(String[] args) {
	
		human h=new human();
		h.eat();
		h.sleep();
		h.speak();
		h.bite();
		h.jump();

	}

}
