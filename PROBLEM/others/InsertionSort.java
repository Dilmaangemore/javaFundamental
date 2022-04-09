package PROBLEM.others;

import java.util.Arrays;

public class InsertionSort {
public static void main(String [] args) {
	// implement insertion sort
	int [] a = {35,1,5,16,3,9,12};
	
	int current;
	int j;
	for(int i=1; i<a.length; i++) {
		current=a[i];
		j=i;
	
		while(j>0&&a[j-1]>current) {
			a[j]=a[j-1];
			j--;
		}
		a[j]= current;
	}
	System.out.println(Arrays.toString(a));
}
}
