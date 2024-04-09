package pkg3;

import java.util.Scanner;

interface bank{
	
	void accountDetails();
	void accountBalance();
	void withdraw(double a);
	void deposit(double amount);
}

class bankApplication implements bank{
	
	double balance;
	
	public bankApplication(double balance) {
		
		this.balance=balance;
	}
	@Override
	public void accountDetails() {
		
		System.out.println("Account Details:");
		System.out.println("Name: Irene Sara Mathew");
		System.out.println("Account No:123456789651456");
		System.out.println("IFSC Code:AFGH56236");
		
	}
	
	public void accountBalance() {
		
		System.out.println("Account Balance:"+balance);
	}

	@Override
	public void withdraw(double a) {
		
		if(balance>=a) {
			balance-=a;
		}
		System.out.println("The balance after withdraw is:");
		accountBalance();
	}

	@Override
	public void deposit(double amount) {
		
		balance+=amount;
		System.out.println("The balance after deposit is:");
		accountBalance();
		
	}
	
}
public class bankUsingInterface {

	public static void main(String[] args) {
		
		char ans;
		Scanner sc=new Scanner(System.in);
		bankApplication b=new bankApplication(50000);
		do {
			
		System.out.println("Which service would you like to have:");
		System.out.println("1.Account Details");
		System.out.println("2.Check Balance");
		System.out.println("3.Deposit");
		System.out.println("4.Withdraw");
		int a=sc.nextInt();

			
		switch(a){
			
		case 1: 
			b.accountDetails();
			break;
		case 2:
			b.accountBalance();
			break;
		case 3:
			System.out.println("Enter the amount to deposit:");
			double amount=sc.nextDouble();
			b.deposit(amount);
			break;
		case 4:
			System.out.println("Enter the amount to withdraw:");
			double aa=sc.nextDouble();
			b.withdraw(aa);
			break;
		default:
			System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue:(y/n)or(Y/N)");
		ans=sc.next().charAt(0);
		}while(ans=='y'||ans=='Y'||ans=='n'||ans=='N');
		
		sc.close();
	}

}
