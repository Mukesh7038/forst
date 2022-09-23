package Polymorphism;

public class Overloading {
	
	public void Demo(int a)
	{
		System.out.println(" Print value of Integer "+a);
		
	}
	public void Demo(int a , int b)
	{ 
		int c =  a + b;
		
		System.out.println(" Addition="+c);
	}
	public void Demo(int a , int b , int c)
	{
		int d = a*b*c;
		System.out.println("Multiplication ="+d);
	}
	public void Demo(char X)
	{
		System.out.println("Running char datatype method");
	}
	public void Demo (String w ) {
		 
		 System.out.println("Running Demo method with String type data = "+w);
	}
	
	public static void main(String[] args) {
		
		Overloading v = new Overloading();
		
		v.Demo(100);
		v.Demo(10, 20, 30);
		v.Demo('A');
		v.Demo(10 , 20);
		v.Demo("sssrrrrrr");
		
	}

}
