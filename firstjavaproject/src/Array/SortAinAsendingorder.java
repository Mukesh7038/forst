package Array;

import java.util.Arrays;

public class SortAinAsendingorder {
	
	public static void main(String[] args) {
		
		int a[] = {12 , 19, 14, 15, 16, 17};
		
		Arrays.sort(a); 
	//	System.out.println(a[a.length-1]);                       // Print Max no in array
		
		//***** This is very important point to remember at the time of revision
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
