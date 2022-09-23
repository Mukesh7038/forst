package test;
class A1
{
	  void m1()
	{
		System.out.println("this is m1 method from A1 Class");
	}
}
interface 	B1
{
	void m2();
	int a=100;
}
interface B2
{
   void m3();	
}
   public class InterfacePeogramm extends A1 implements  B1, B2
    {
	   public void m2()    
	{
		System.out.println("this is m2 method from B1 interface");
	}
	public void m3()
	{
		System.out.println("this is m3 method from B2 interface");
	}
   public static void main(String[] args) {
	   InterfacePeogramm mi=new InterfacePeogramm();
	   System.out.println(a);
	   mi.m1();
	   mi.m2();
	   mi.m3();
	}
}



   
   
   
   
   
   /* class A1{
             
    	void m1()
    	{
    		System.out.println("This is m1 method from A1 class");
    	}
    	
	   
   }
    
    interface B1 
    {
    	int x= 10;
    	void m2 ();
    }
   interface B2 
   {
	   int y=100;
	   void m3();
   }
   
   public class HybridInheritance extends A1 implements B1 ,B2
   {
	   
	   public void m2() {
		   
		   System.out.println("This is m2 method from B1 interface");
	   }
	   
	   public void m3() {
		   System.out.println("This is m3 method from B2 interface");
	   }
	   
	   
	   public static void main(String[] args) {
		   HybridInheritance h = new HybridInheritance();
		   
		   h.m1();
		   h.m2();
		   h.m3();
		System.out.println(y); 
		System.out.println(x);
	}
} 


    public abstract class HybridInheritance              // incomplete Class
    {
	  static int a = 200 ;
	  public void display() {
           System.out.println("This is Display method from HybridInheritance class");
	  }
	  
	  abstract void show();                   // incomplete method
	  
	  abstract void blank();                  // incomplete method
  }*/

   
   
   
   
   
   
   
   
   
   






























