package Array;

import java.util.Arrays;

import java.util.Collections;
public class SortArrayInDesendingOrder {
	
	public static void main(String[] args) {
		
		int a [] = { 12, 14, 16, 9, 10 , 25,55};
		
	    Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+" ");
		}
	}
}
