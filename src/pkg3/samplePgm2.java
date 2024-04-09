package pkg3;

import java.util.Scanner;

public class samplePgm2 {
	
	
	public int largeNumber(int size,int[] n) {
		
		int max=n[0];
		for(int i=0;i<size;i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
		return max;
	
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] n=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
		}
		samplePgm2 s2=new samplePgm2();
		int ans=s2.largeNumber(size,n);
		System.out.println("The largest number among the array elements is:"+ans);
		
		sc.close();
	}

}
