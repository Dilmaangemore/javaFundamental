package PROBLEM.String;

public class remove_char_space_Other {
	
	public static void main(String[]args) {
	String str= "$131#@% &abcd123 ABCDEFU";
	String str2= str.replaceAll("[^a-zA-z0-9]", " ");
	System.out.println(str2);		
	}
}
