package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class leapYearProgram {
	
	public static void main(String [] args) {
		
		int n ;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Year");
		
		n = sc.nextInt();
		
		if((n%400==0)||(n%4==0 && n%100!=0))
		{
		 System.out.println("LEAP YEAR");	
		}
		else
		{
			System.out.println("NOT LEAP YEAR");
		}
	}

}
