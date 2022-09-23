package Casting;

public class TestCasting {
	
	
public static void main(String[] args) {
		
		UpCastingB uc = new UpCastingC();
		
	//	uc.don();
	//	uc.muks();
		
		uc.car();
		uc.cycle();
		uc.vehical();
		
		((UpCastingB) uc).don();
		
}

 /*	public static void main(String[] args) {
		UpCastingA ua =new UpCastingB();
		ua.car();
		ua.cycle();
		ua.vehical();
	//	uc.don();
   //    uc.muks();
    * }
	*/
}
