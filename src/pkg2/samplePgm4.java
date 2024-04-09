package pkg2;

import java.util.Scanner;

public class samplePgm4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] n=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
		}
		
		int greaterNumber=n[0];
		
		for(int i=1;i<n.length;i++) {
			if(n[i]>greaterNumber) {
				greaterNumber=n[i];
			}
		}
		System.out.println("The greatest number among the array elements is:"+greaterNumber);
		sc.close();
	}

}
