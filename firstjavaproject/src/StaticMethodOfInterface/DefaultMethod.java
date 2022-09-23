package StaticMethodOfInterface;

 interface DefaultMethod {
	
	default void Adiition() {
		int a = 100;
		int b = 200 ;
		 int c = a + b ;
		 System.out.println(c);
		
	}
}
interface DefaultMethod1 {
	 default void Substraction () {
		  int  a = 200 ;
		  int b = 100 ;
		  int c = a - b ;
		   
		  System.out.println(c);
	 }
}
interface StaticMethod{
	
	int  a = 1000;
	
	static void xyz() {
		 System.out.println(" xyz Static Method is Running from StaticMethod INTERFACE");
	}
}