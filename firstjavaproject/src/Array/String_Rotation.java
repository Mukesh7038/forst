package Array;

import java.util.Scanner;

public class String_Rotation {

	public static void main(String[] args) {
		
		String a = "Java is good Knowledge";
		String [] b = a.split(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Rotations : ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			String first = b[0];
			for(int j=0; j<b.length-1; j++) {
				b[j]=b[j+1];
	        }
			b[b.length-1] = first;
		}
		System.out.println("after left rotation : ");
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
