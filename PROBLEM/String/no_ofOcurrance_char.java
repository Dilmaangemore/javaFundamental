package PROBLEM.String;

public class no_ofOcurrance_char {
	public static void main(String []args) {
	
String str= "vishnu pratap";
int length= str.length();
/*
String str2= str.replace("a", "");
int lengthafter= str2.length();

System.out.println("no of occurance of a is:"+(length-lengthafter));
**************************************/
  
char[] c = str.toCharArray();
int count =0;
		for(int i=0;i<length;i++) {
			if('p'==c[i]) {
				count++;
			
			}
		
		}
		System.out.println("number of occurance of p in str is:"+count);
	}
	

}
