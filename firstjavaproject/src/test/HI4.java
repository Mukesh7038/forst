package test;

public class HI4 {
	public static void main(String[] args) {
		
		
		System.out.println("******HI1 out-Put****************");
		
		HI1 h1= new HI1();
		
		h1.Display();
		h1.addi();
		h1.sub();
		
		System.out.println("********HI2 out-put**************");
		
		HI2 h2 = new HI2();
		 h2.addi();
		 h2.multiplication(100);
		 h2.sub();
		 
		 System.out.println("**********HI3 out-put***********");
		 
		 HI3 h3 = new HI3();
		 h3.addi();
		 h3.sub();
		 h3.multiplication(200);
		 
	}

}
