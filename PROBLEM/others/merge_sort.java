package PROBLEM.others;

import java.util.Arrays;

public class merge_sort {
	public static void main(String[] args) {
		
int [] arr = {41,62,23,46,2,9,89,25,15,65};

		merge_sort b = new merge_sort();
		b.sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[]arr, int begin, int end) {
		
		if(begin < end ) {
			
			int middle = (begin+end)/2;
			sort(arr, begin, middle ); //0to 4
			sort(arr, middle+1, end);
			
			//merge(arr, begin,middle,end);
			
		}
		
		
	}
	
	public void merge(int[]arr, int begin, int middle, int end) {
		
		int leftArraySize = middle - begin +1;
		int rightArraySize = end-middle;
		int[] leftArray= new int [leftArraySize];
		int[]rightArray= new int  [rightArraySize];
		
		for(int i=0;i<leftArraySize; i++) {
			leftArray[i]=arr[begin+1];
			
		}
		for(int j=0; j<rightArraySize; j++) {
		rightArray[j]= arr[middle +1+j];
		
		}
		
		int i=0; 
		int j=0;
		int k=begin;
		
		while(i<leftArraySize && j<rightArraySize ) {
			if(leftArray[i] < rightArray[j] ){
				arr[k]= leftArray[i];
				i++;
				
				
			}else {
				arr[k]=rightArray[j];
				j++;
				
			}
			k++;
			
		}
		while(i<leftArraySize) {
			arr[k]=leftArray[i];
			i++;
			k++;
			
					
		}
		while(j< rightArraySize) {
			arr[k]= rightArray[j];
			j++;
			k++;
			
		}
		
	}

}
