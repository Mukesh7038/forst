package Array;

public class PrintReverseArray {
	
	public static void main(String[] args) {
		
		
		String a [] = {"JAVA","C","C++","PYTHON"};
		
		for(int i=0; i<a.length;i++) {
			
			System.out.print(a[(a.length-1)-i]+", ");
		}
	}

}

