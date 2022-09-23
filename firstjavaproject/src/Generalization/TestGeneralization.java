package Generalization;
                                       // Generalization Mostly Preferrd Interface
public class TestGeneralization {
	
	public static void main(String[] args) {
		
		System.out.println("**********Jio Features*************");
		
		jio j = new jio();
		
		j.audiocalling();
		j.SMS();
		j.Internet();
		j.validity();
		
		
		j.NewfeatureA();
		
		
		System.out.println("************Idea Feature ***********");
		
		Idea i = new Idea();
		
		i.audiocalling();
		i.SMS();
		i.Internet();
		i.validity();
		
		
		i.NewFeatureB();
	}

}
