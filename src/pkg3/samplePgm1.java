package pkg3;

import java.util.Scanner;

public class samplePgm1 {
	
	
	public int sum(int s) {
		int sum = 0;
		for(int i=1;i<=s;i++) {
			sum+=i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of natural numbers:");
		int s=sc.nextInt();
		
		samplePgm1 s1=new samplePgm1();
		int answer=s1.sum(s);
		System.out.println("The sum of first "+s+" natural numbers are:"+answer);
		
		sc.close();
	}

}
