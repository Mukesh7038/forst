package Array;

public class SearchSpecificNumberInArray {
	
public static void main(String[] args) {
		
    int a [] = { 10, 20, 30, 40, 50,60};
	
	int searchnumber = 40;
	boolean flag = false;
	
	for(int i =0;i<=a.length-1;i++) {
		
		if(searchnumber == a[i]) {
			
			System.out.println("Number found : " +a[i]);
			flag = true;
			break;
		}
	 }
       if(flag==false) {
    	   System.out.println("Number Not Found");
       }
	}

}
