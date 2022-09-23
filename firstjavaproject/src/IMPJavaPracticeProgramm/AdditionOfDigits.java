package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class AdditionOfDigits {
	
	public static void main(String [] args) {
		
		int d , no , sum=0 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		no = sc.nextInt();
		
		while(no>0) {
			
			d= no%10;
			no=no/10;
			sum = sum +d;
		}
		System.out.println(sum);
	}

}
