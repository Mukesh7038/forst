package ConditionalStatement;

import java.util.Scanner;

public class Scannerobj {
	
	public static void main(String[] args) {
	
	int Mukesh;
	
	System.out.print("Enter your age:");
	
	Scanner sc=new Scanner(System.in);
	Mukesh = sc.nextInt();
	
	if (Mukesh>30) {
		System.out.println("You are expericed");
	}
	else if(Mukesh>25) {
		System.out.println("you are semi-experinced");
	}
	else if(Mukesh>18)
	{
		System.out.println("You are fresher");
	}
	else {
		System.out.println("You are not eligible");
	}
  }
}
