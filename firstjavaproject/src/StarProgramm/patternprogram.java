package StarProgramm;

public class patternprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=1 ;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {	
				System.out.print(n+" ");
			n++;
			}
			System.out.println();
			n++;	
		}
	}

}
