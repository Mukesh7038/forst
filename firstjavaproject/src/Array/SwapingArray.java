package Array;

import java.util.Arrays;

public class SwapingArray {
	
	 public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int temp;

		for(int i=0;i<=(a.length/2)-1 ;i++) {                // OR only  i<(a.length/2) 
			
			
			temp = a[i];
			
			a[i] = a[(a.length-1)-i];
			
			a[(a.length-1)-i]= temp ;
		}
		  System.out.println();
		  for(int i = 0;i<=(a.length-1);i++){                     // OR only i<(a.length)
	        System.out.print(a[i]+",");
		}
	}
	
	
}
