package ArrayList;
import java.util.ArrayList;
public class example2 {
public static void main(String[]args) {
	ArrayList list= new ArrayList();
	list.add("vishnu");
	list.add("arun");
	list.add(9);
	System.out.println("before clearing out arraylist");
	System.out.println(list.isEmpty());//false
	
	list.clear();
	System.out.println("after clearing out arraylist");
	System.out.println(list.isEmpty());//true
	
	
}
}
