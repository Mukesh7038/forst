package Array;

public class SearchingAnSpecificElementOfArray {
	
	
	public static void main(String[] args) {
		
	int a [] = { 10, 20, 30, 40, 50,60};
	
	int searchelement = 40;
	boolean flag=false;
	
	for(int i =0;i<=a.length-1;i++) {
		
		if(searchelement==a[i]) {
			
			System.out.println("Element found at: "+i);
			flag =true;
			break;
		}
	 }
       if(flag==false) {
    	   System.out.println("Element Not Found");
       }
	}
}
