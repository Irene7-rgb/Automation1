package pkg3;

import java.util.Scanner;

public class samplePgm3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		String end_string="language";
		
		boolean ends=s.endsWith(end_string);
		
		
		System.out.println(ends);
		sc.close();
	}

}
