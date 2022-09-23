package test;
	
	interface ABC 
	{
		int x=100;
		void m1();
	}
	
	interface XYZ
	{
		int y=200;
		void m2();
	}
	public class MultipleInheritanceTest implements ABC, XYZ
	{
	  static int A  = 100;    
		public void m1()
		{
		   System.out.println(x);
		}
		public void m2()
		{
			System.out.println(y);
		}
		public static void main(String[] args) {
		MultipleInheritanceTest t=new MultipleInheritanceTest();
		t.m1();
		t.m2();
		System.out.println(t.A);                 // if Global variables are not static then follow this
		System.out.println(A);                    
		System.out.println(MultipleInheritanceTest.A);
	}
}
