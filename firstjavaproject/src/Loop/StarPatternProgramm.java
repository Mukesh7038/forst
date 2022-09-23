package Loop;

public class StarPatternProgramm {
	
	public static void main(String [] args) {
				
		//  No. 1
      
	/*	   for ( int i =1 ; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
	   }
    */	
		
		// Pattern No.2
		
		      /* int space =4;
			     int star = 1;
			
			for(int i=1; i<=5;i++) {
				for(int j=1; j<=space;j++) {
				System.out.print(" ");
				}
				for(int j=1; j<=star;j++) {
				System.out.print("*");
				}
				System.out.println();
				space--;
				star++;
			    } 
			*/
		
		// Programm No. 3
		
    /*		for(int i=5; i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
    /*
		
		  // No.  4 
		   
    /*		int space = 4;
		    int star = 1;
		
		  for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=space; j++) {
				System.out.print(" ");
					
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");       // change 
			}
		        System.out.println();
		    space--;
			star++;
		}
		
	*/	
		
		// No. 5
	
    /*   int space=4;
	     int star=1;
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		space--;
		star=star+2;
	}
			
    */		
	      // No.6
		
	/*	   int space =0;
		   int star =9;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
			 System.out.print(" ");
			}
			for(int j=1; j<=star;j++) {
			 System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;		
			}
			 			
   */
	 // pattern No. 7       By using For and if else
		
	  /*  int space=4;
		  int star=1;
		
		for(int i=1;i<=9;i++) {
			
			for(int j=1; j<=space;j++ ) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
			if(i<=4) {
				space--;
			    star=star+2;
			}
			 else
			 {
				space++;
			    star=star-2;
			 }
		}
		
    */	
		
	// Pattern No. 8     By using for and if else
		
    /*		int star=1;
     
		for(int i=1; i<=9;i++) {
		
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=4) {
				star++;
			}
			else {
				star--;
			}
		}
				
   */		
	    // Pattern No. 9
		
	/*	int space=4;
		int star=1;
		
		for(int i=1;i<=9;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4) {
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
		}
	*/
		
		
   }
}
