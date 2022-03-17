package stringmethod;

public class indexof {
public static void main(String[]args) {
	String s= "vishnu pratap singh b.tech in mehanical engineeering in vnrvjiet at hyderabad in telangana";
	/**********012345678912345678912345678912345678912345678912345678912345678912345678912345678912345678**/
    	
	System.out.println(s.indexOf("in")); // count from v at 0 to 15 " in"avilable in "singh"
	System.out.println(s.indexOf('i', 1));// return 1 means true -1 means false
	System.out.println("p is avail at index"+s.indexOf('p'));// 7
	System.out.println(s.indexOf("in", 20));
	
	/*lastindexOf()*/
	System.out.println(s.lastIndexOf("in"));
	System.out.println(s.lastIndexOf('a'));
	System.out.println(s.lastIndexOf("in", 50));
}
}
