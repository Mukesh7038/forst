package IMPJavaPracticeProgramm;

public class CountSpaceInStr {
	
	public static void main(String[] args) {
		
	/*  int a [] = new int[5]; // Declare an array with size 5.
	  
	  a[0]=100;
	  a[1]=200;
	  a[2]=300;
	  a[3]=400;
	  a[4]=500;
*/
		int a[]= {100 , 200 , 300, 400, 500};// Declare arry without specific size
		
		System.out.println("Length of an Array is:"+a.length);
		
	   for(int i: a) {
		   System.out.println(i);
	   }
	}

}
