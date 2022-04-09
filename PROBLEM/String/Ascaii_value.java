package PROBLEM.String;

import java.util.Scanner;

public class Ascaii_value {
public static void main(String []args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any character");
	char c= sc.nextLine().charAt(0);
	int av=(int)c;
	System.out.println("ASCAII value : "+av);
	
	
}
}
