package PROBLEM.array;

import java.util.Arrays;

public class reverseArr {
public static void main(String[]args) {
	int [] a= {5,1,2,3,4};
	
	int start=0;
	int last=a.length-1;
	int temp;
	while(start<last) {
		 temp=a[start];
		 a[start]=a[last];  
		a[last]=temp;
		start++;
		last--;
		
	}
	
	System.out.println(Arrays.toString(a));
}
}
