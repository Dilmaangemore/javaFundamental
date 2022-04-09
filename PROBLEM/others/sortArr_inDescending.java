package PROBLEM.others;

import java.util.Arrays;
import java.util.Collections;

public class sortArr_inDescending {

	public static void main(String[]args) {
	Integer [] ar= {9,3,1,2,6,5,4,8,7};
	
	Arrays.sort(ar, Collections.reverseOrder());
	
	System.out.println(Arrays.toString(ar));
	
	}
}
