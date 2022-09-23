package test;

public  class AbstractClass extends InterfacePeogramm{
	
	 static int x =100;
	void show () {
		
	    int y= 100;
		System.out.println(" this is show method from HybridInheritance Class");
		System.out.println(super.a);
	}
	
	void blank () {
		System.out.println(" This is blank method from HybridInheritance Class");
	}
	
	public static void main(String[] args) {
		
		AbstractClass h =new AbstractClass();
		
	//	h.display();
		h.show();
	    h.blank();
	    System.out.println(InterfacePeogramm.a);
	    
	    h.m2();
	    h.m1();
	    
		System.out.println(AbstractClass.a);
		System.out.println(x);
	}
}
