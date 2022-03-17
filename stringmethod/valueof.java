package stringmethod;

public class valueof {
	public static void main(String[]args) {
		int i=10;
		String a=String .valueOf(i);
		System.out.println(a);
		char[] c= {'a','r','u','n'};
		//String ch=String.copyValueOf(c);
		String cha=String.copyValueOf(c, 1, 3);
		//System.out.println(ch);
		System.out.println(cha);
		}
	}
	

