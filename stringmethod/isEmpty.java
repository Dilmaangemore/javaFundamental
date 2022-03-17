package stringmethod;

public class isEmpty {
public static void main(String []args) {
	String a=" ";
	String b= "reading";
	System.out.println(a.isEmpty());// return false due to space
	System.out.println(a.isBlank());//return true even there is space
	System.out.println(b.isBlank());
}
}
