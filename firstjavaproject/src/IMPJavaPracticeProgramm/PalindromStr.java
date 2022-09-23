package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class PalindromStr {
	
	public static void main(String [] args) {
		
       System.out.println("Enter the String");
       
       Scanner sc = new Scanner(System.in);
       
      String str =sc.next();
		
		String revstr = sc.next();
		
		for(int i = str.length()-1;i>=0;i--) {
			
			revstr = revstr + str.charAt(i);
		}
		if(str.equals(revstr)) 
		{
			System.out.println("The Given String Is Palindrom");
		}
		else
		{
			System.out.println("String is not an Palindrom");
		}
		
	}

}
