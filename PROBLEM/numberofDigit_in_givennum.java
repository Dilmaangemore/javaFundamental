package PROBLEM;

import java.util.Scanner;

public class numberofDigit_in_givennum {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any digit");
     int num= sc.nextInt();
     
     int count=0;
     //542
     while(num>0) {
    	 count++;
    	 num=num/10;
     }
     System.out.println(count);
	
	
	
}

}
