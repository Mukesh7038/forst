package IMPJavaPracticeProgramm;

public class PrimeNumberP2 {
	
	public static void main(String[] args) {
		
		   int count=0 ,no=0 ;
		
		for(int n = 1;n<= 100 ; n++) {
			
			    count =0;
			    for(int i =1; i<=n ; i++)
			{
				if(n%i==0) {
			    count++;
				}
			}
			 if(count==2)
			{
				System.out.print(n+" ");
				
				no++;
			}
		}
		System.out.println();
		System.out.println("Total Number of prime Number count between 1 to 100"+no);
	}
}
