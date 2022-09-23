package Loop;

public class NumberPattern {
	
	public static void main(String[] args) {
		
	/* 1
	 * 12
	 * 123
	 * 1234
	 * 12345	
	 */
		
		
	/*	for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			System.out.println();
		                 
		}
		*/
		
		
		
		/* 12345
		 * 1234
		 * 123
		 * 12
		 * 1  
		 */
		
	/*	for(int i=5;i>=1;i--)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		
		
		/*      1
		 *     12
		 *    123
		 *   1234
		 *  12345  
		 */     
		 
   /* int space=4;
	for( int i=1; i<=5;i++) {
	for(int j=1;j<=space;j++) {
					
		System.out.print(" ");
		}
	for(int j=1;j<=i;j++) {
		System.out.print(j);
		}
		System.out.println();
		space--;
		}
		*/
		
		
		/* 12345
		 *  1234
		 *   123
		 *    12
		 *     1
		 */
	   
		
	/*	 int space =0;
		 
		 for(int i=5;i>=1;i--) {
			 for(int j=1;j<=space;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 System.out.println();
			 space++;
		 }
		*/
		
		
		/*         1
		 *        222
		 *       33333
		 *      4444444
		 *       55555
		 *        666
		 *         7    
		 */
		 
		
	/*	int space =3;
		int p=1;
		for(int i=1;i<=7;i++) {
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			for( int j=1;j<=p;j++) {
				System.out.print(i);
			
			}
			System.out.println();
			
			
			if(i<=3) {
				space--;
				p=p+2;
			}
			else {
				space++;
				p=p-2;
			}
		}
		*/
		
	/*
	 *          1
	 *         121
	 *        12341
	 *       1234561
	 *        12341
	 *         121
	 *          1
	 * 
	 */
	        
	/*	 int space=3;
		 int p=1;
		 int q=1;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<p;j++) {
				System.out.print(j);
			}
			for(int j=1;j==q;j++) {
				System.out.print(q);
			}
				
			System.out.println();
	
			if(i<=3) {
				space--;
				p=p+2;
				
			}
			else {
				space++;
				p=p-2;
			}
	  }
			
	*/
		
		
	/*        1             1             3   
	 *       333           123           444
	 *      55555         12345         55555    
	 *     7777777   OR  1234567  OR   6666666 
	 *      55555         12345         77777
	 *       333           123           888
	 *        1	            1             9
	 */
		
		
		int space =3;
		int p =1;
		
		for(int i = 3 ; i<=10 ; i++) {
			for(int j=1;j<=space ;j++) {
				System.out.print(" ");
			}
			for(int j=1 ;j<=p ;j++) {
				System.out.print(j);           // ********try diff inputs insted of i like j , p ect. **********
			}
			
			System.out.println();
			if(i<=5) {
				p = p+2;
				space--;
			}
			else
			{
				p=p-2;
				space++;
			}
	    }
	    
		
		
	/*	int space =3;
		int  p =1 ;
		int q =1;
		
		for(int i= 1 ; i<=7 ; i++) {
			for(int j=1 ; j<=space ; j++) {
			System.out.print(" ");
			}
			for(int j=1 ; j<p;j++) {
				System.out.print(j);
			}
			for(int j=1 ; j==q;j++) {
				System.out.print(q);
			}
			System.out.println();
			
			if(i<=3) {
				space--;
				p = p+2;
			}
			else
			{
	             space++;
	             p=p-2;
			}
		}
		*/
		
		
		
		
		
	/*         1	
		      234
		     56789
	*/	
		 
		
/*		int space =2 ;
		int p=1 ;
	    int x , q=1;
		 for(int i=1 ; i<=3 ;i++) {
			 for(int j=1 ;j<=space;j++) {
				 System.out.print(" ");
			 }   
			     x  = q ;
			    for(int j=1 ; j<=p;j++) {
				 System.out.print(q);
				  q++;
			 }
			 System.out.println();
			  space --;
			  p=p+2;
		 }
*/
		  
		
	/*        1
	 *      2 3 4
	      5 6 7 8 9
	*/	
	 /*   int space = 4;
		    int p = 1;
		    int x , q =1 ;
		    
		    for(int i=1 ; i<=3 ; i++) {
		    	for(int j=1; j<=space;j++) {
		    		System.out.print(" ");
		    	}
		    	 x = q;
		    	for(int j=1; j<=p;j++) {
		    		System.out.print(q+" ");
		    		q++;
		    	}
		    	System.out.println();
		    	
		    	space = space - 2;
		    	p = p+2;
      }
	*/    
	    
	
    /*      1 2 3 4 5 6	
		     2 3 4 5 6
		      3 4 5 6 
		       4 5 6 
		        5 6
		         6
	*/
		
/*		 int space = 0 ; 
		for (int i =1 ; i<=6; i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=6;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			space++;
		}
		*/
	}
}
