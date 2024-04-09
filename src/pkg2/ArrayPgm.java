package pkg2;

import java.util.Scanner;

public class ArrayPgm {

	public static void main(String[] args) {
		
		String names[]=new String[4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names:");
		for(int i=0;i<4;i++) {
			 names[i]=sc.next();
			
		}
		System.out.println("The entered names are:");
		for(int i=0;i<4;i++) {
			System.out.println(names[i]);
		}
		sc.close();

	}

}
