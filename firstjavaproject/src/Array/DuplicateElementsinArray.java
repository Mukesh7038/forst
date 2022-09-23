package Array;

public class DuplicateElementsinArray {
	
	public static void main(String[] args) {
		
		
		String arr[]= {"java","C","C++","Python","java1"};
		
		boolean flag=false;
		
		for(int i =0;i<=arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("Found Duplicate Element:"+arr[i]);
					
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Element not found");
		}
	}

}
