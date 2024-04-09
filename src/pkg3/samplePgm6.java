package pkg3;

import java.util.Scanner;

public class samplePgm6 {
	
	
	public void fibonacci(int size) {
		int f=0,s=1,t=0,i=0;
		System.out.print(f+" "+s);
		do {
			t=f+s;
			System.out.print(" "+t);
			f=s;
			s=t;
			i++;
			
		}while(i<size);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the fibonacci series:");
		int size=sc.nextInt();
		
		samplePgm6 s6=new samplePgm6();
		s6.fibonacci(size);
	
		accessModifiersPgm ac=new accessModifiersPgm();
		System.out.println(ac.b);
		
		sc.close();
		

	}

}
