package pkg3;

import java.util.Scanner;

public class samplePgm9 {

	public void totalNumber(int size,int[] n) {
		
		int countn=0,countp=0,countz=0;
		for(int i=0;i<size;i++) {
			if(n[i]==0) {
				countz++;
			}
			else if(n[i]>0) {
				countp++;
			}
			else {
				countn++;
			}
		}
		System.out.println("The total numbers of zeros are:"+countz+" ,positive numbers are:"+countp+" and negative numbers are:"+countn);
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
		
		samplePgm9 s9=new samplePgm9();
		s9.totalNumber(size,n);
		
		sc.close();
	}

}
