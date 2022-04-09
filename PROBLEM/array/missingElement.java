package PROBLEM.array;

public class missingElement {

	public static void main(String[] args) {
		
     int [] a= {1,2,3,4,6};
     int sum=0;
     for(int i=0; i<=6;i++) {
    	 sum=sum+i;
    	 
     }
     int sumwithmissing=0;
     for(int i=0; i<a.length;i++) {
    	
    	sumwithmissing=sumwithmissing+a[i];
     }
    	 
     
   System.out.println(sum-sumwithmissing);
   
	}

}
