package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class PrimeNumberP1 {
	
	public static void main(String[] args) {
		
		
		int n , i , count=0 ;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number");
		
		n = s.nextInt();
		
		for(i =1 ; i<=n ;i++ ) {
			
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Number is Prime Number");
		}
		else
		{
			System.out.println("Not an Prime Number");
		}
	}

}
