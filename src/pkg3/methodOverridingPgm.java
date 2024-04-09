package pkg3;


class father{
	
	public void job() {
		System.out.println("Doctor");
	}
}
class son extends father{
	
	@Override public void job() {
		System.out.println("Engineer");
		super.job();
	}
	
}

public class methodOverridingPgm {

	public static void main(String[] args) {
		
		son s=new son();
		s.job();

	}

}
