package PROBLEM.array;

public class maxMin_inArray {

	public static void main(String[]args) {
		
		int [] a= {8,1,5,9,12,33,7,4,3};
		int max=a[0];
		int min=a[0];
		
		
		for(int i=0; i<a.length; i++) {
			if (max<a[i]) {
				max=a[i];
			}
			if (min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}
}
