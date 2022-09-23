package test;

public class constructorOverloading {
	
	
	constructorOverloading(int a , int b)
	{
		System.out.println(a+b);
	}
	
	constructorOverloading(int a, double b)
	{
		System.out.println(a+b);
	}
	constructorOverloading(double a,int b)
	{
		System.out.println(a+b);
	}
	constructorOverloading(int a, int b, int c)
	{
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args)
	{
		constructorOverloading co=new constructorOverloading(1,2.5);
		
		
 }

}
