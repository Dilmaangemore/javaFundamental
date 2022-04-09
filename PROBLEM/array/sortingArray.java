package PROBLEM.array;

import java.util.Arrays;

public class sortingArray {
// sorting the element in Array using build in function
	public static void main(String[]args) {
		int [] a= {8,1,5,9,12,33,23,7,4,3};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}
}
