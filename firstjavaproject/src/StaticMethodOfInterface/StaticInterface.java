package StaticMethodOfInterface;

interface A {
	
	int X = 100 ;
	
	static void Demo() {
		int a = 100 ;
		System.out.println(a);
		
		System.out.println("Demo static method is running from interface ");
	}

}

interface B{
	
	void Display();
	
}
  
	public class StaticInterface  {
	  public static void main(String[] args) {
		
		 // System.out.println(X);
		  
		  
		 A.Demo();
		 
	}
}
	
	  
  
