package Array;

public class MaxNoFrmArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,25,89,95,23,12,98};
		
		int max = a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
		}
		System.out.println("Print Max Number:"+max);
	}
}
