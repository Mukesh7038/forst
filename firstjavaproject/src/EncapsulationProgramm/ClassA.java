package EncapsulationProgramm;

public class ClassA {
	
	private int a = 55;
	static private int b = 87;
	
	public static void mat(int d) {
		
		b = d;
		
		System.out.println(b);
	}
	
	public int get() {
		
		return a;
	}

}
