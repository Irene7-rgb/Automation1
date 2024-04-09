package pkg3;

import java.util.Scanner;

public class samplePgm4 {

	public double avrNumbers(int a,int b,int c) {
		
		double avg=(a+b+c)/3;
		return avg;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		samplePgm4 s4=new samplePgm4();
		double ans=s4.avrNumbers(a, b, c);
		
		System.out.println("The average of 3 numbers are:"+ans);
		
		sc.close();

	}

}
