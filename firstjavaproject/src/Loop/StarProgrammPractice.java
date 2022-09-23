package Loop;

public class StarProgrammPractice {
	public static void main(String [] args) {
		// programm no. 14
		
		
		/*int space=0;
		int star=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
		space=3;
		star=2;
		for(int i=6;i<=9;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}*/
		
		// programm no.  07
		
	/*	int space=4;
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
		
		
		 space=1;
		 star=7;
		
		for(int i=6;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}*/
		
		
  // Programm No. 9
		
	/*	int space=4;
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
			star++;
		}
		
		space=1;
	     star=4;
		
		for(int i=6;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		*/
		
		
	// Programm No. 12	
		
	/*	int space=0;
		int star=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		
	     star=2;
		
		for(int i=6;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			star++;
			
			
		}*/
		
	// Programm No. 13	
		
		int space=0;
		int star=5;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4) {
				space++;
			star--;
			}
			else {
				
				space--;
				star++;
			}
			
		}
		
	     

		
		
		
		
		
		
		
		
		
		
		
		
		
		// Programm for Wholo rectangle 
		
		
		
	 /*       for(int i=1;i<=5;i++) {
			
			
				
				if( i==1 || i==5 ) {
					System.out.print("*****");
				}
				else
				{
					System.out.print("*   *");
				}
				
			
			System.out.println();
		}
		
		*/
		
		
		
		
		// Programm for Right angle tringle No. 14
		
	
	
		
   /*		for(int i=1;i<=5; i++) {
			if(i==1) {
				System.out.print("*");
			}
			
		    else if(i==2) {
				System.out.print("**");
			}
			else if(i==3) {
				System.out.print("* *");
			}
			else if (i==4) {
				System.out.print("*  *");
			}
			else {
				System.out.print("*****");
			}
			System.out.println();

		} */
		
		
		
//		Programm No.args 15
		
 /* *
    **
    * *
    *  *
    *****
    *  *
    * *
    **
    *
*/             
		                                       
		      /*  for(int i=1; i<=5; i++) {
		        	
		    	  for(int j=1;j<=i;j++) {
		    		  if(j==1 || j==i || i==5 )
		    			  System.out.print("*");
		    		  else
		    			  System.out.print(" ");
		    	  }
		    	  System.out.println(); 	  
		          
		        }
		        
		        for(int i=9; i>=6; i--) {
			    	  
			    	  for(int j=6;j<=i;j++) {			    		  
			    		  if(j==6 || j==i )			    			  
			    			  System.out.print("*");
			    		  else
			    			  System.out.print(" ");
			    	  }
			    	  System.out.println();
			      }
		        */
		
		
		
		
  // Programm No. 16
		
/*   *****
     *  *
     * *
     **
     *
 */
		
	/*	    for(int i=5; i>=1;i--){
			for(int j=1;j<=i;j++) {
							
				if(j==1 || j==i || i==5)				
					System.out.print("*");					
				else
					System.out.print(" ");					
				}
			System.out.println();			
		}
	*/
		
		// Hollow Diamond
		
/*        *
 *       * *
 *      *   *
 *     *     *
 *    *       *
 *     *     *
 *      *   *
 *       * *
 *        *
 * 
 */
               
	/*	int space =4;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			if(i==1 || i==9) {
				System.out.print("*");
			}
			else if(i==2 || i==8)
			{
				System.out.print("* *");
			}
			else if (i==3 || i==7)
			{
				System.out.print("*   *");
			}
			else if(i==4 || i==6)
			{
				System.out.print("*     *");
			}
			else
			{
				System.out.print("*       *");
			}
			
			System.out.println();
			
			if(i<=4) {
	         space--;
			}
			else
			{
				space++;
			}
		}*/
		
	}
}
