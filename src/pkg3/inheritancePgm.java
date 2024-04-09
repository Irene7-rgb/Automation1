package pkg3;


class Member{
	String name;
	int age;
	String address;
	double salary;
	
	public void printDetails() {
	
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
	}
}
	
class Employee extends Member{
	String spec;
}

class Manager extends Member{
	String dept;
}


public class inheritancePgm {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Irene";
		emp.age=27;
		emp.address="Thayil";
		emp.salary=50000;
		emp.spec="Tester";
		emp.printDetails();
		

	}
}
