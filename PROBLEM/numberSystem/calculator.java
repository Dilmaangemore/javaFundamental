package PROBLEM.numberSystem;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		int firstnum = sc.nextInt();
		System.out.println("enter operator");
		char operator = sc.next().charAt(0);
		System.out.println("enter second num");
		int secondnum= sc.nextInt();
		
		double result=0;
		boolean status=true;
		switch(operator) {
		case '+' : result=firstnum+secondnum;
		break;
		case '-' : result=firstnum-secondnum;
		break;
		
		case '*' : result= firstnum*secondnum;
		break;
		
		case '/' : result= firstnum/secondnum;
		break;
		default: System.out.println("invalid operator");
		status=false;
		}
		System.out.println(firstnum+""+operator+""+secondnum+"= " +result);
	}

}
