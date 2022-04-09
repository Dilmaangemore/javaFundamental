package PROBLEM.String;

public class printLastthreeleteer_oftext {
public static void main(String[] args) {
	String str="vishnu pratap";
	String lastthreeleter= "";
	char[] c = str.toCharArray();
	int size=c.length-1;
	for(int i=size; i>size-3;i--) {
		lastthreeleter+=c[i];	
	}
	System.out.println(lastthreeleter);
}
}
      