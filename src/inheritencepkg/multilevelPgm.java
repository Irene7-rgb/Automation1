package inheritencepkg;

class Animal{
	public void animalDetails() {
		System.out.println("Animal Details");
	}
}
class Dog extends Animal{
	public void dogDetails() {
		System.out.println("Dog Details");
	}
}
class babyDog extends Dog{
	public void babyDogDetails() {
		System.out.println("Baby Dog Details");
	}
}

public class multilevelPgm {

	public static void main(String[] args) {
		
		babyDog b=new babyDog();
		b.animalDetails();
		b.dogDetails();
		b.babyDogDetails();
	}

}
