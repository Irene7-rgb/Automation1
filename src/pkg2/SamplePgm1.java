package pkg2;

public class SamplePgm1 {

	public static void main(String[] args) {
		String s="Testing Training Center";
		String reversedWords="";
		String[] words=s.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			reversedWords+=words[i]+" ";
		}
		System.out.println(reversedWords);

	}

}
