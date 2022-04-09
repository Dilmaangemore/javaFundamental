package PROBLEM.String;

public class captitalize_eachword {


	// capitalize firstletter of  each word of given string 
	
	
	public static void main(String[]args) {
		
		String finalstatement="";
		String str = "this is my first java program";
		String [] str2= str.split("");
		
	     for ( String words:str2) {
	    	 char [] ca= words.toCharArray();
	    	 char c= ca[0];
	    	 String firstchar =String.valueOf(c).toUpperCase();
	         String b= firstchar;
	
	       for(int i=1;i<ca.length; i++) {    
	       	 b=b+ca[i];
	        	 
	       } 
	        finalstatement= finalstatement+b;

	     }  
	     System.out.println(finalstatement);
	}
}

