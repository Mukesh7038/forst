package test;

public class Sample {
	 static int a=100;
	
	public static void method1() {
		
		
		System.out.println("Method 1 is exicuted from the Sample Class xxxx");
	}
	
	 public static void method2() {
		System.out.println("Method 2 is exicuted from the Sample Class yyyyy");
	}
	
	public static void main(String[] args) {
		
	
		
		Sample.method1();
	    Sample.method2();
		System.out.println(a);
		int a=150;
		System.out.println(a);
	}

}
