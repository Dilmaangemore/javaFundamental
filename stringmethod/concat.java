package stringmethod;

public class concat {
public static void main(String []args) {
	String a = "vishnu";
	String b = " ";
	String c = "pratap";
	String d= " ";
	String e = "singh";
	System.out.println(a.concat(b).concat(c).concat(d).concat(e));
	System.out.println(a+b+c+d+e);
	
	System.out.println("vishnu".concat(" ").concat("singh"));
			
}
}
