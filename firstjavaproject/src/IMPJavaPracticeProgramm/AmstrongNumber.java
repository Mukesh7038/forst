package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
	int d , n ,temp ,sum=0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	
	n = sc.nextInt();
	
	temp = n ;
	while(n!=0) {
		
		d= n%10;
		sum=sum +d*d*d;
		n = n/10;
	}
	System.out.println(sum);
	if(temp == sum) {
		
		System.out.println("The given no is AmstrongNumber");
	}
	else
	{
		System.out.println("The no NOT an AmstrongNumber");
	}
	
	}
}
