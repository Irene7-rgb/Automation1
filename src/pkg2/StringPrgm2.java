package pkg2;

import java.util.Scanner;

public class StringPrgm2 {

	public static void main(String[] args) {
		char ch;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=sc.next();
		int length=word.length();
		for(int i=0;i<length;i++) {
			ch=word.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
				
		}
		System.out.println("The total number of vowels are:"+count);
		sc.close();

	}
}

