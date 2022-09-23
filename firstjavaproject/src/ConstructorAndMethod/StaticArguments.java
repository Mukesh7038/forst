package ConstructorAndMethod;

public class StaticArguments {
	
	public static void addition (int a , int b, int c)
	{
		int d = a+b+c ;
		System.out.println("Addition="+d);
	}
 	public void multiplication(int a , int b)
	{
	    int c = a*b;
	    System.out.println("Multiplication="+c);
	}
 	
/*	public void multiplication(int a)
	{
		System.out.println("Running int datatypes");
	}
*/
/*	public static void main(String[] args) {
  
		addition(10,20);
		StaticArguments obj =new StaticArguments();
		obj.multiplication(2,8);
}*/
 	
	    public static void main(String[] args) {
		StaticArguments x =new StaticArguments();
		
   //   x.multiplication(23);
		
		x.multiplication(5  ,3 );
		x.multiplication(11 ,10);
		addition (100, 200, 300);				
   }
}