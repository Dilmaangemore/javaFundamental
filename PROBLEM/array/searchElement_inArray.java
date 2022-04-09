package PROBLEM.array;

public class searchElement_inArray {

	public static void main(String[]args) {
		int [] a= {8,1,5,12,33,23,7,4,34};
		
		// search given element in array
//33   
		int num=33;
	 boolean search= false;
		
		for(int i=0; i<a.length; i++) {
			if(num==a[i]) {
				search=true;
				
			System.out.println(num +" "+ "found at index no. :" +i);
			break;
			
			}
		
		
		}
		if(!search) {
			System.out.println("not available");
			
			// output; 33 found at index no. :4
		}
			
	}
}
