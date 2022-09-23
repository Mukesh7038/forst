package Loop;

public class CharPattern{
	
	public static void main(String [] args) {
		
/*	       char p,q;
	       int space=4;
	       
	       q='A';
	       
	       for(int i=1;i<=5;i++) {
	    	   
	    	     p=q;   
	    	   for(int j=1; j<=space;j++) {
	    		   System.out.print(" ");
	    	   }
	    	   
	    	  for(int j=1;j<=i;j++) {
	    	   System.out.print(p);
	    	   p++;
	    	   
	    	  }
	    	  System.out.println();
	    	  
	    	  space--;
	       }
	       
	 */      
	       
	       
	       
	/*      A
	       A A
	      A B A
	     A B C A
	    A B C D A
	     A B C A
	      A B A
	       A A
	        A
      */
	     /*  char a='A';
			char b='A';
			int p=1;
			int space=4;
			for(int i=1;i<=9;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print(" ");
				}
				
				for(int j=1;j<p;j++) {
					System.out.print(a+" ");
					a++;
				}
				for(int j=1;j==1;j++) {
					System.out.print(b);
				}
				System.out.println();
				a='A';
				if(i<=4) {
					space--;
					p++;
				}
				else
				{
					space++;
					p--;
				}
			}
	       
	     */ 
		
		
		/*  A
		 *  AB
		 *  ABC
		 *  ABCD
		 *  ABCDE 
		 */
	       
	 /*      char p='A';
	       char q='A';
	       
	       for(int i=1;i<=5;i++) {
	    	   p=q;
	    	   for(int j=1;j<=i;j++) {
	    		   System.out.print(p);
	    		   p++;
	    	   }
	    	   System.out.println();
	       }
	       */
		
		/*    ABCDE
		 *    ABCD
		 *    ABC
		 *    AB
		 *    A
		 */
		 
	/*	char p='A';
		char q='A';
		
		for(int i=5;i>=1;i--) {
			p=q;
			for(int j=1;j<=i;j++) {
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
		
	*/
		
		
	
	/*	
		
         ABCDE
          ABCD
           ABC
            AB
             A
            AB
           ABC
          ABCD
         ABCDE

*/
		
		char p='A';
		char q='A';
		int X=5;
		int space=0;
		
		for(int i=1;i<=9;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			p=q;
			for(int j=1;j<=X;j++) {
				System.out.print(p);
				p++;
			}
			System.out.println();
			if(i<=4) {
				space++;
				X--;
			}
			else {
				space--;
				X++;
			}
		}
	}
}
