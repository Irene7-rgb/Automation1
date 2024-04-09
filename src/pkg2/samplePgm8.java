package pkg2;

public class samplePgm8 {

	public static void main(String[] args) {
		
		String s="Java 3.0";
		String wordToInsert="Tutorial";
		
		int middle=s.length()/2;
		String firstHalf=s.substring(0,middle);
		String secondHalf=s.substring(middle);
		
		System.out.println(firstHalf+" "+wordToInsert+" "+secondHalf);
	}

}
