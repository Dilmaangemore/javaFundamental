package PROBLEM.array;

import java.util.Arrays;

public class compareTwoArray {
	
	// compare two Array without using inbuilt function;

	public static void main(String[] args) {
		
		int [] a= {4,5,6,7,8,9};
		int [] b= {4,5,6,7,8,9};
		
		boolean compare= true;
		if (a.length==b.length) {
			for(int i=0;i<a.length; i++)
				if(a[i]!=b[i])
					compare=false;
		}else {
			compare=false;
		}
if(compare) {
	System.out.println(Arrays.toString(a)+"is equal to"+ Arrays.toString(b));
	
}else {
	System.out.println(Arrays.toString(a)+"is not equal to"+ Arrays.toString(b));
}
	}

}
