package PROBLEM.others;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a = {1,3,5,6,9,12,14,19,21,22,23};
		
	Scanner sc= new Scanner (System.in);
	System.out.println("enter search num");
	int searchNumber = sc.nextInt();
	
		sc.close();
	
	int low =0;
	int high= a.length-1;
	int mid= 0;
	
	while(low<=high) {
		mid= (low+high)/2;
		if(searchNumber==a[mid]) {
			System.out.println("search num is available at index : "+mid);
			break;
		}else if (searchNumber<a[mid]) {
			high =  mid-1;
			
		}else if(searchNumber>a[mid]) {
			low = mid+1;
			
		}
	
	}
	
	if(low>high)
	{
		System.out.println("given no. is not available in Array");
	}
	
	}

}
