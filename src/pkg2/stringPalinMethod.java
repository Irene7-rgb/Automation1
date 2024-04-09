package pkg2;

public class stringPalinMethod {

	public static void main(String[] args) {
	
		stringPalinMethod sp=new stringPalinMethod();
		String word=sp.Palindrome("malayalam");
		if(word.equalsIgnoreCase("malayalam")){
			System.out.println("The word is a palindrome");
		}
		else {
			System.out.println("The word is not a palindrome");
		}

	}
	
	public String Palindrome(String s) {
		
		String newWord = "";
		int length=s.length();
		for(int i=length-1;i>=0;i--) {
			newWord+=s.charAt(i);
		}
		return newWord;
		
	}

}
