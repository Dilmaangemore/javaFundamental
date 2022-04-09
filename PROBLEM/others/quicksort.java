package PROBLEM.others;

import java.util.Arrays;

public class quicksort {
public static void main(String[] args) {
	
	int [] arr= {50,25,119,41,62,0,21,65,84,33,21};
	
	quicksort Quicksort= new quicksort();
	Quicksort.sort(arr, 0, arr.length-1);
	
	System.out.println(Arrays.toString(arr));
}
public void sort(int [] arr, int lowerBound, int upperBound) {
	if(lowerBound < upperBound) {
	int location = partition(arr,lowerBound, upperBound);
	
	sort(arr,lowerBound, location-1);
	sort(arr,location+1, upperBound);
	}
}
public int partition(int[]arr, int lowerBound, int upperBound) {
	int pivot = arr[lowerBound];
	int start = lowerBound;
	int end = upperBound;
	
	while(start<end) {
	while(arr[start]<=pivot) {
		start++;
		
	}
	while(arr[end]>pivot) {
		end--;
		
	}
	if(start<end) {
	swap(arr, start, end);
	
          }
	
	}
	swap(arr,lowerBound, end);
	return end;
	
}
public void swap(int[]arr, int s, int e) {
	int temp;
	temp=arr[s];
	arr[s]= arr[e];
	arr[e] = temp;
}

//[0, 21, 21, 25, 33, 41, 50, 62, 65, 84, 119]
}
