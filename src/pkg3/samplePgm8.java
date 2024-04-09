package pkg3;

import java.util.Scanner;

public class samplePgm8 {

	public static void main(String[] args) {
		char ans;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=a+b;
			System.out.println("The sum of 2 numbers are:"+sum);
			System.out.println("Do you want to continue(Y/N)or(y/n):");
			ans=sc.next().charAt(0);
		}
		while(ans=='y'||ans=='Y');
		System.out.println("The loop got terminated");
		sc.close();
	}

}
