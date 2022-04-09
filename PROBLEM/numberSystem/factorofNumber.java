 package PROBLEM.numberSystem;

public class factorofNumber {
	public static void main(String [] args) {
		
		// find the factors of given no and count number of factors.
		
		//6=1,2,3,6
		
		    int num= 6;
		    int count =0;
		    for(int i=1; i<=num;i++) {
		    	if (num%i==0) {
		    		System.out.print(i+" ");
		    	}
		    	count++;
		    	
		    }
		    System.out.println(" number of factors of given num is : "+count);
	}

}
