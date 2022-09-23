package Array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicacyByHashSet {

	public static void main(String[] args) {
		
		int a[]= {10, 20, 30, 20, 20 , 10 , 50 , 40 ,60,60};
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();  // if we create object of only HashSet then we get result in Desending order
		
		for(int i=0; i<=a.length-1;i++) {
			
			hs.add(a[i]);
		}
		for(int no : hs) {
			
			System.out.print(no+" ");
		}

	}

}
