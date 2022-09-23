package EncapsulationProgramm;

public class ClassB extends ClassA {
	
	public static void main(String[] args) {
		
		ClassA.mat(100);
		
		
		ClassB x=new ClassB();
		
		int y = x.get();
		System.out.println(y);
	}

}
