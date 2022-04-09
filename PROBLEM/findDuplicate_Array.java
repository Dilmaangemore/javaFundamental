package PROBLEM;

public class findDuplicate_Array {

//find the Duplicate element in Array
	public static void main(String[]args) {
	int []a = {3,4,5,3,6,4};
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]+"is duplicated in array");
			}
		
		}
	
	}
	
	}
	
	
}

