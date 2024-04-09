package pkg2;

import java.util.Scanner;

public class samplePgm9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String word=sc.next();
		char[] c=word.toCharArray();
		
		System.out.println("The Duplicate characters are:");
		for(int i=0;i<word.length();i++) {
			for(int j=i+1;j<word.length();j++) {
				if(c[i]==c[j]) {
					System.out.print(c[i] + " ");
					break;
				}
			}
		}
		
		sc.close();
	}

}
