
package ArrayList;
import java.util.ArrayList;


public class example {
public static void main(String[]args) {
	ArrayList list= new ArrayList();
	list.add("Arun");
	list.add("varun");
	list.add("tharun");
	System.out.println(list);
	System.out.println(list.get(0));
	for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
	System.out.println(list.contains("arun"));
	}
	
}
}
