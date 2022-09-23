
package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class FactorialOfNo {
	public static void main(String[] args) {
		
		int n ;
		int fact=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Calculating Factorial:");
		
		n = sc.nextInt();
		
		for(int i = 1; i<=n ; i++)
		{	
			fact = fact * i;	
		}
		System.out.println("Factorial of n ="+fact);
	}
}
