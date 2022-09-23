package Loop;

import java.util.Scanner;

public class ForLoop1 {
	public static void main(String[] args) {
		
	    int n1 , n2,n ,i,sum ;
	    
	   System.out.println("Print the value of Statement");
	   Scanner sc =new Scanner(System.in);
	   n=sc.nextInt();
	   
	   n1=0;
	   n2=1;
	    
	   for(i=1; i<=n;i++)
	   {
	    System.out.println(n1);
	    	
	    sum=n1+n2;
	    n1=n2;
	    n2=sum;
	     
	   }
	}
	
 }
