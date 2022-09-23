package Array;

public class LargestElement_array {

	public static void main(String[] args) {
		
		int [] a = {25,11,7,56,75,89,87,93};
		
		int max= a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
			
		
		}
       System.out.println("Largest Element in Array:"+max);
	}

}
