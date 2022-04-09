package PROBLEM.numberSystem;

import java.util.Scanner;

public class covert_sec_tohr_min_sec {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// intake number in second and convert into hours:minutes:seconds
	//5000
	
	System.out.println("enter seconds");
	int totalsecond = sc.nextInt();
	sc.close();
	int minute= totalsecond/60;
	
	int remainingsecond= minute%60;
	
	int hour = minute/60;
	int remainingminute=minute%60;
	System.out.println();
	
	System.out.println(hour+":"+remainingminute+":"+remainingsecond);
	
}
}
