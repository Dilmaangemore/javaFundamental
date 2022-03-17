package stringmethod;

public class substring {
public static void main(String[]args) {
	String a = "vishnu pratap";// indexs v,i,s,h,n,u,space,p,r,a,t,a,p 0,1,2,3,4,5,6,7,8,9,10,11
	System.out.println(a.substring(5)); // u pratap
	System.out.println(a.substring(0, 6));//vishnu
	System.out.println(a.subSequence(2, 5));//shn
	System.out.println(a.substring(2, 5));//shn
	
}
}
