package constructorpkg;

public class constructorPgm {
	
	String empname;
	int empid;
	
	public constructorPgm(String empname,int empid) {
		this.empname=empname;
		this.empid=empid;
	}
	public void display() {
		System.out.println("empname="+empname);
		System.out.println("empid="+empid);
	}
	public static void main(String[] args) {
		
		
		constructorPgm cp=new constructorPgm("Irene",001);
		cp.display();
	}

}
