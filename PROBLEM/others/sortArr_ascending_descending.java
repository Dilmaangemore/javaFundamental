package PROBLEM.others;

import java.util.ArrayList;
import java.util.Collections;

public class sortArr_ascending_descending {
public static void main(String[] args) {
	// sort an Arrays in aaascending and descending order;
	
	ArrayList<Integer>alist= new ArrayList<Integer>();
	
	alist.add(9);
	alist.add(7);
	alist.add(1);
	alist.add(3);
	
	System.out.println("default order :"+alist);
	Collections.sort(alist);
	System.out.println("Adcending order : "+alist);
	Collections.sort(alist, Collections.reverseOrder());
	System.out.println("descending order : "+alist);
	
}
}
