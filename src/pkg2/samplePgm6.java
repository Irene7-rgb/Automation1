package pkg2;

import java.util.Scanner;

public class samplePgm6 {

	public static void main(String[] args) {

		int oddCount=0,evenCount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] n=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
			if(n[i]%2==0) {
				evenCount+=1;
			}
			else {
				oddCount+=1;
			}
		}
		System.out.println("The total even numbers are:"+evenCount+" and total odd numbers are:"+oddCount);
		sc.close();
	}

}
