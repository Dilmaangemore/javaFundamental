package PROBLEM;

import java.util.HashSet;

public class findDuplicate_HashSet {

	public static void main(String[]args) {
		int []a= {3,4,6,4,8};
		HashSet<Integer>hset=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(hset.add(a[i])==false) {
				System.out.println(a[i]+"is duplicate in array");
			}
		}
		
		
		
		
	}
}
