package PROBLEM.numberSystem;

import java.util.Scanner;

public class GCD {
	
	
//	12=1,2,3,4,6,12
//     6=1,2,3,6
//	 Gcd = greatest common divisor=6
     
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter firstnumber");
	int num1= sc.nextInt();
	System.out.println("enter second number");
	int num2= sc.nextInt();
	
	sc.close();
	
	int gcd = 0;
	
	
	for(int i=1; i<=num1&&i<=num2;i++) {
		if (num1%i==0&&num2%i==0) {
		gcd=i;
		}
		
	}
	System.out.println(gcd);
}
}
