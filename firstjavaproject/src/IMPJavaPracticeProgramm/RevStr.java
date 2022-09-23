package IMPJavaPracticeProgramm;

public class RevStr {
	
	public static void main(String [] args) {
		
        String str ="Welcome To Java";
		
		String revstr = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			
			revstr = revstr + str.charAt(i);
		}
		System.out.println(revstr);
	}

}
