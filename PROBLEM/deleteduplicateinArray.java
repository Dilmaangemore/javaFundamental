package PROBLEM;

public class deleteduplicateinArray {
public static void main(String[]args) {
	//Delete duplicates from sorted Array
	
	int [] a= {3,4,4,5,5,5,6,7,9,9,};
	int j=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			 a[j]=a[i];
			j++;
		}
	}
	a[j]=a[a.length-1];// retriving and adding 9th ekement 
	for(int k=0;k<=j;k++) {
		
		System.out.print(a[k]);
		
	}
	

	
	
}
}
