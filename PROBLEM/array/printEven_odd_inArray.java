package PROBLEM.array;

public class printEven_odd_inArray {
public static void main(String[]args) {
	int [] a = {6,1,4,7,5,9};
	
	for (int i=0; i<a.length; i++) {
		if (a[i]%2==0) {
			System.out.print(a[i]+" ");
		}
		
	}
	System.out.println();
	for (int i=0; i<a.length;i++) {
		if (a[i]%2!=0) {
	System.out.print(a[i]+" ");		
		}
		
	}
	
}
}
