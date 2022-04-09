package PROBLEM.array;

import java.util.Arrays;
import java.util.Scanner;

public class creatArr_taking_input {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter size of arr");
	int size= sc.nextInt();
	
	// creating arr
	
	int [] a= new int[size];
	for(int i=0; i<size;i++) {
		System.out.println("enter elements of array");
		a[i]=sc.nextInt();
	
	}
	sc.close();
	System.out.println(Arrays.toString(a));
}
}
