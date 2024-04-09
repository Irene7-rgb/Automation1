package pkg2;

import java.util.Scanner;

public class sumofsingledim {

	public static void main(String[] args) {
		int Sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int[] n=new int[size];
	
		
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
			Sum+=n[i];
		}
		System.out.println("The entered numbers are:");
		for(int i=0;i<size;i++) {
			System.out.println(n[i]);
		}
		System.out.println("The sum of the entered numbers are:"+Sum);
		sc.close();
	}

}
