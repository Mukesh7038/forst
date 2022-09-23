package VariableBasic;

public class Stringfunction {
	
	public static void main(String[] args) {
	
	String s="  Welcome";
	
	String s1="   To Java  ";
	
	System.out.println(s.length());
	
	System.out.println(s.concat(s1));
	
	System.out.println(s1.trim());
	
	System.out.println(s.charAt(3));
	
	System.out.println(s.contains("Wel"));
	
	System.out.println(s.equals("Welcome"));
	
	System.out.println(s.equals("welcome"));
	
	System.out.println(s.equalsIgnoreCase("welcome"));
	
    System.out.println(s.replace('o','L'));
    
    System.out.println(s1.replace('o','L'));
	}
    

}
