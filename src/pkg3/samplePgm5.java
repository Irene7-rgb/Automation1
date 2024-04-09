package pkg3;

import java.util.Scanner;

public class samplePgm5 {
	
	public void totalChar(String s) {
		
		int count=0;
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=" ".charAt(0)) {
				count++;
			}
		}
		System.out.println("Total number of characters are:"+count);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
		samplePgm5 s5=new samplePgm5();
		s5.totalChar(s);
		
		
		sc.close();
		
	}

}
