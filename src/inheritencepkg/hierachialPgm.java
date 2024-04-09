package inheritencepkg;

class Animal1{
	public void animalDetails() {
		System.out.println("Animal Details");
	}
}
class Lion extends Animal1{
	public void lionDetails() {
		System.out.println("Lion Details");
	}
}
class Tiger extends Animal1{
	public void tigerDetails() {
		System.out.println("Tiger Details");
	}
}
	
public class hierachialPgm {

	
	public static void main(String[] args) {
		
		Lion l=new Lion();
		l.animalDetails();
		l.lionDetails();
		Tiger t=new Tiger();
		t.animalDetails();
		t.tigerDetails();
		

	}

}

