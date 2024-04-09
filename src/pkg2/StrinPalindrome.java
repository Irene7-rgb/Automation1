package pkg2;

import java.util.Scanner;

public class StrinPalindrome {

	public static void main(String[] args) {
		String reversedword="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=sc.next();
		int length=word.length();
		for(int i=length-1;i>=0;i--) {
			reversedword+=word.charAt(i);
		}
		if(word.equalsIgnoreCase(reversedword)) {
			System.out.println("The word is a palindrome");
		}
		else {
			System.out.println("The word is not a palindrome");
		}
		sc.close();
	}

}
