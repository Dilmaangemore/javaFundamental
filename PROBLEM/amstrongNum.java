package PROBLEM;

import java.util.Scanner;

public class amstrongNum {
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
    
	System.out.println(" enter any num");	
	int num = sc.nextInt();
	int originalNum= num;
	int cube=0;
	while(num>0) {//153
		
		int remainder = num%10;//3
		
		cube= cube+(remainder*remainder*remainder);//0+27=27
		
		num=num/10;
		
		
	}
	
         if (originalNum==cube) {
        	 System.out.println(originalNum+ "  " + "is Amstrong num");
        	 
         }else {
        	 System.out.println(originalNum+ " " + "is not a amstrong num ");
         }
}
}
