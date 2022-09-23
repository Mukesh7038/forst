package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicacy {

	public static void main(String[] args) {
//		
//		int a []= {10, 20, 30, 10 , 30 , 50};
//		
//		Arrays.sort(a);
//		
//		int [] temp = new int [a.length];
//		int j=0;
//        
//		for(int i=0;i<a.length-1 ;i++) {
//			if(a[i]!=a[i+1]) {
//				
//				temp[j]=a[i];
//				j++;
//			}
//			
//		}
//		temp[j]=a[a.length-1];
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(temp[i]+" ");
//		}
//	}
int a=0;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=33; i<=n;i++) {
	System.out.println(i);
	i=i+a;
	a++;
	}

}
}
