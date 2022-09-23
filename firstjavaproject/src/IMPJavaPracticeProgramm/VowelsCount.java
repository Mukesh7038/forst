package IMPJavaPracticeProgramm;

public class VowelsCount {

	public static void main(String[] args) {
		
		String s="WelcomE";
		
		String s1 = s.toLowerCase();
		
	int	vCount=0;
	int cCount=0;	
		
		for(int i=0;i<=s1.length()-1;i++) {
			
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' ||s1.charAt(i)== 'o' || s1.charAt(i)== 'i' || s1.charAt(i)== 'u') {
				
				vCount++;
			}
			
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				
				cCount++;
			}
		}
		
		System.out.println("Number of vowels:"+vCount);
		
		System.out.println("Number of consonants:"+cCount);

	}

}
