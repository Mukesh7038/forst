package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class palimdromno {
	
	public static void main(String[] args) {
		
		
		int no , d , temp , sum=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number");
		
		 no = s.nextInt();
		 
		 temp = no ;
		 
		 while(no!=0)
		 {
			 
			 d = no % 10 ;
			 no = no / 10;
			 sum = sum  + d ;
		 }
		 
		 if ( temp == sum) {
			 
			 System.out.println("The Number is Palindrom");
		 }
		 else
		 {
			 System.out.println("The Number is not an Palindrom");
		 }
	}

}
