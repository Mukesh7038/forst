package IMPJavaPracticeProgramm;

public class RevEachWordInStr {
	
	public static void main(String[] args) {
		
		String str = "Welcome To Java";
		String reversestring = "";
		
		String [] words = str.split(" ");      //  split the string in WORD and Store Into **words**[] Array Variable 
		
		for(String w : words) {
			
			String reverseword="";
			
			for(int i = w.length()-1;i>=0;i--) {
				reverseword = reverseword +w.charAt(i);
		    }
			reversestring = reversestring + reverseword +" ";
		}
		System.out.println(reversestring);
	}

}
