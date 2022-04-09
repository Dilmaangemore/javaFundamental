package PROBLEM.String;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ipaddressofUrl {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter website url : ");
	String website= sc.nextLine();
	
	sc.close();
	
	try {
	InetAddress ip= InetAddress.getByName(website);
		System.out.println("ip address of given url is: "+ip);
		
	
	}catch(UnknownHostException e) {
		System.out.println("user has inputed invalid web url");
	}
}
}
