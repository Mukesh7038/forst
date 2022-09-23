package IMPJavaPracticeProgramm;

public class SwapTwoNo {
	
	public static void main(String[] args) {
		
		int  x = 100 , y= 200 , temp ;
		
		System.out.println("Number Before Swaping X="+x+"  "+"Y="+y);
	        
		temp =  x ;
		x=y;
		y=temp;
		
		System.out.print("Number After Swaping X="+x+"   "+"Y="+y);
		
	}
}
