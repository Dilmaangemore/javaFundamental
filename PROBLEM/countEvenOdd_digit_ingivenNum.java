package PROBLEM;

import java.util.Scanner;

public class countEvenOdd_digit_ingivenNum {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num= sc.nextInt();
		int countEven=0;
		int countOdd=0;
		
		
		while(num>0) {
			int rem= num%10;
			if(rem%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
			num=num/10;
		}
		System.out.println("no of even digit is:"+countEven+"  " +"no of odd digit:"+countOdd);
		
	}
}
