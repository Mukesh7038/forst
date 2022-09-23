package Polymorphism;

public class Overriding1 extends Overriding {
	
	public void Display()
	{
		System.out.println("Running Display method from the Overriding sub-class");
	}
	
	public void Display(int b)
	{
		System.out.println(" Executing Display Method from Sub-class"+b);
	}
	public static void main(String[] args) {
		
		Overriding1 xxx = new Overriding1 ();
		
		xxx.Display(100);
		xxx.Display();
		
		Overriding  yyy = new Overriding();
		yyy.Display();
		yyy.Display(200);
		
		
	}

}
