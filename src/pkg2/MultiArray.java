package pkg2;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		
		String arr[][]=new String[2][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.next();
			}
		}
		
		for(String[] s:arr) {
			for(String ss:s) {
				System.out.print(ss+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
