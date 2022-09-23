package ConstructorAndMethod;

public class Test {
	
	static int a ;
	static int i,j,k;
	int b;
	int c;
	String e;
	static String g;
	float f;

	Test(){
		a=30;
		b=100;
		c=50;
		e="Mukesh";
		g="Ganesh";
		f=0.77f;
	}
	
	Test(int a, int b)
	{
		b=150;
		
	}
	Test(int a, String g)
	{
	    e=g;
	    c=a;
	 
	    b=100;
	}
	Test(int a, int b, int c)
	{
	    i=a;
	    j=b;
	    k=c;
	    e="Mukesh";
	    g="Ramesh";
	}
	
	public static void addition() {
		
		System.out.println(i+j+k);
	}
	public static void work() {
		System.out.println(a);
		System.out.println(j);
		System.out.println(k);
	}
}
