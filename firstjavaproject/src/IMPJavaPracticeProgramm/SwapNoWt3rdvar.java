package IMPJavaPracticeProgramm;

import java.util.Scanner;

public class SwapNoWt3rdvar {
	
	static int a , b ;

	public static void main(String[] args) {
		

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Two Number ");
		
		a =sc.nextInt();
		b= sc.nextInt();
		
		System.out.println("Number before Swaping    A="+a+"   "+" B="+b);
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Number after swaping     A="+a+"   "+" B="+b);
		
	}

}
