package PROBLEM.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class reversepositionofwords {

	public static void main(String[]args) {
		String str="the statement is one";
		String []words= str.split("");
		
	    List<String>list=Arrays.asList(words);
	   
	   
		Collections.reverse(list);
		
	    for(String word:list) {
	    	System.out.print(word+" ");
	    }
	    
	    
	    
	}
}
