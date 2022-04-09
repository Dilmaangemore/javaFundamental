package PROBLEM;

import java.util.Scanner;

public class factorialofgivennum {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number");
		int num = sc.nextInt();
		
	int fact= 	factorial(num);
	System.out.println("factoral of given num"+num+"is :"+fact);
	}
	
		
		public static int factorial(int n) {
			if(n==0) {
				return 1;
				
			}else {
				return n*factorial(n-1);
			}
		}
		
		
		
	
}
