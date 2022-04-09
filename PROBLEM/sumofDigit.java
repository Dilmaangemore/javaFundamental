package PROBLEM;

import java.util.Scanner;

public class sumofDigit {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number more than single digit");
		int num = sc.nextInt();
		sc.close();
		//5432
		int sumofDigit=0;
		
		while(num>0) {
			int remainder = num%10;
			sumofDigit=sumofDigit+remainder;
			num=num/10;
		}
				
				
		System.out.println("sum of digits of given num:"+sumofDigit);		
	}
}
