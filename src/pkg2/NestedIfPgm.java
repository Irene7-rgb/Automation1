package pkg2;

public class NestedIfPgm {

	public static void main(String[] args) {
		int age=14,weight=40;
		
		if(age>=18) {
			if(weight>50) {
				System.out.println("The Person can donate the blood");
			}
			else {
				System.out.println("The Person can't donate the blood because the weight is below 50");
			}
		}
		else {
			System.out.println("Age must be greater than 18");
		}
	}

}
