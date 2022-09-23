package Array;

public class printEvenELArray {
	
	public static void main(String[] args) {
		
		int a[] = {11, 14, 17 , 20, 27, 28 , 30};
		
		for(int i =0; i<=a.length-1;i++) {
			
			if(a[i]%2==1) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
