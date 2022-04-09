package PROBLEM.numberSystem;

import java.util.Scanner;

public class reverseGivenNumber {
	//Reverse the given number

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
         
       // 1234
        int reverseNum=0;
        
        while(num>0) {
        	int reverse= num%10;
        	reverseNum=(reverseNum*10)+reverse;
        	num= num/10;
        }
        System.out.println(reverseNum);
    
	}

}
