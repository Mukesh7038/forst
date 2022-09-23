package datatype;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		float Distance =2000.0f;
		float Duration =4.5f;
		float DurationInSecound= Duration*60*60;
		float myspeed=Distance/DurationInSecound;
		
		System.out.println("Given distance is "+Distance+" "+"meter");
		System.out.println("Given Duration is "+Duration+" " +"Hours");
		System.out.println("My Speed is "+myspeed+" "+"meter/sec ");
		
		
		
	}

}
