package PROBLEM.String;

public class RverseString {

	public static void main(String[]args) {
		String str= "Mr Arun Motoori";
		
		String [] words = str.split("");
		
	  String reverse="";
		
	for(int i=words.length-1;i>=0;i--) {
		reverse= reverse+words[i];
	}
		System.out.println(reverse);
		
	}
}
