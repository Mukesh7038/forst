package ConstructorAndMethod;

import java.util.Scanner;

public class Method extends StaticArguments {
	
	 static int a , b, c;
	
	public static void m1()
	{
		 c = a + b;
		 
		 System.out.println(c);
	}
    public static void m2()
    {
    	c= a-b;
    	
    	System.out.println(c);
    }
    
    public void m3()
    {
    	c = a/b;
    	
    	System.out.println(c);
    }
    
    public void m4() 
    {
    	c= a*b;
       System.out.println(c);
    }
    
    
    public static void main(String [] args)
    
    
    {
    
    /*  Scanner obj =new Scanner(System.in);
    	System.out.println(" Enter the value of inputs");
    	  a = obj.nextInt();
    	  b= obj.nextInt();
    */ 
    	
  /*  	  Method x = new Method();
    	
    	
    	 m1();
    	 m2();
    	 x.m3();
    	 x.m4();*/
    	  
    //	  StaticArguments.addition(10,20);
    	  
    	  StaticArguments y =new StaticArguments();
    	  
    	  y.multiplication(50,2);
    } 
}
