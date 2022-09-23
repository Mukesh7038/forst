package InterviewProgramm;

public class CommanArray {
	
	public static void main(String [] args) {
		
		int a[] = {10,20,30,40,50};
		int b[] = {11,21,20,31,41,40,30,10};
		
		for(int i =0; i<a.length;i++) {
			for(int j=0; j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					System.out.print(a[i]+" ");
				}
			}
		}
	
	}
}
