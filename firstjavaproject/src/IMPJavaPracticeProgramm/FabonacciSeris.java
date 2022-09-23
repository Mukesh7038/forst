package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class FabonacciSeris {
	
	public static void main(String[] args) {
		
		int  sum , n1=0 , n2=1 , n ;
		Scanner sc =new Scanner(System.in);
		System.out.println("Print First n Numbers in Series");
		n = sc.nextInt();
		
		for(int  i =0 ; i<n ; i++)
		{
			 System.out.print(n1+" ");
			 sum= n1 + n2;
			 
			 n1=n2;
			 n2=sum;	 
		}		
	}
}