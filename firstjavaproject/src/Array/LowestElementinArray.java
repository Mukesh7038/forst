package Array;

public class LowestElementinArray {

	public static void main(String[] args) {
		
		int [] a = { 10,9,8,92,54,29,2,75,99,100};
		
		int min =a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]<min) {
				
				min = a[i];
			}
		}
		System.out.println("Lowest Element in Array:"+min);
	}

}


