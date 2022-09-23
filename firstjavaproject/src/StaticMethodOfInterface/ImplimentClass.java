package StaticMethodOfInterface;

public class ImplimentClass implements B , DefaultMethod , DefaultMethod1 {
	
	public void Display() {
		
		int w = 10;
		System.out.println("Display Method is Running ");
		System.out.println(w);
	}
	
	public void addition() {
		int a = 500;
		int b = 500;
		int c = a+ b ;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
	//	A.Demo();
	//	StaticMethod.xyz();
		
		ImplimentClass i = new ImplimentClass();
		//  i.Display();
		  
		  
		  
		  
		  i.Adiition();
		  
		  
		  
		//  i.Substraction();
		
	}

}
