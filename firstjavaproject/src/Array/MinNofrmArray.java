package Array;

public class MinNofrmArray {

	public static void main(String[] args) {
		
		int b []= { 12,15,55,66,9,80,5};
		
		int min =b[0];
		
		for(int i=0;i<=b.length-1;i++) {
			
			if(b[i]<min) {
				
				min=b[i];
			}
		}
		System.out.println("Print Min Number:"+min);

	}

}
