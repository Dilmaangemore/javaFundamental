package PROBLEM.others;

import java.util.Scanner;

public class linearSearch {
public  static void main(String[]args) {
	int [] a= {55,29,3,5,7,99,24,36,47,86};
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number to search in arr");
	int num= sc.nextInt();
	
	sc.close();
	
	//logic for linear search algorithm
	int count=0;
	for(int i=0; i<a.length; i++) {
		if(num==a[i]) {
			System.out.println("given num"+num+" is available at index:  "+i);
			count++;
			break;
		}
		
		
	}
	if (count==0) {
		System.out.println("given num is not available in array");
	}
}
}
