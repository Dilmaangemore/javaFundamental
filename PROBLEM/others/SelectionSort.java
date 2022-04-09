package PROBLEM.others;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;

		int [] a = {35,1,5,16,3,9,12};
		for(int i=0; i<a.length; i++) {
			int m=i;
			for(int j=i+1;j<a.length; j++) {
				if(a[j]<a[m] ) {
					m=j;
				}
			}
			temp= a[i];
			a[i]=a[m];
			a[m]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
