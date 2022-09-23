package IMPJavaPracticeProgramm;

import java.util.Scanner;
public class ReverseNumber {
	
	public static void main(String [] args) {
		
		 int no ;
		 int d , sum =0;
		 System.out.println("Enter the string");
		 Scanner sc=new Scanner(System.in);
		 no=sc.nextInt();
		
	     while (no!=0)                      //  OR    no>0  
	     {
	    	d = no%10;
	    	no= no/10;
	    	sum = sum * 10 + d;
	     }
	     System.out.println(sum);
	     
	}

}
