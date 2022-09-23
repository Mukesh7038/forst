package StaticMethodOfInterface;

public interface Addition {
	
	default void Addition1 () {
		  
		int a = 1000 ;
		int b = 500 ;
		int c = a+ b ;
		
		System.out.println(c);
	}

}
