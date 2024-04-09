package inheritencepkg;

class Parent{
	
	public void parentDetails()
	{
		System.out.println("Parent Details");
	}
}
class child extends Parent{
	
	public void childDetails() {
		System.out.println("Child Details");
	}
}

public class singlelevelPgm {

	public static void main(String[] args) {
	
		child c=new child();
		c.parentDetails();
		c.childDetails();
	}

}
