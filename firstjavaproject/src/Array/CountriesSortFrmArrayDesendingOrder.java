package Array;

import java.util.Arrays;

import java.util.Collections;

public class CountriesSortFrmArrayDesendingOrder {

	public static void main(String[] args) {
		
		String countries[]= {"Zimbabwe","South-Africa","India","America","Yugoslavia","Australia","Denmark","France",
				             "Netherlands","Itali","Fig"};
		
		Arrays.sort(countries,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(countries));	
	}	
}
