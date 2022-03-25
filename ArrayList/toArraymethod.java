package ArrayList;
import java.util.ArrayList;
public class toArraymethod {
	
	public static void main(String[]args) {
		
		ArrayList<String> list= new ArrayList<>();
		list.add("vishnu");
		list.add("arun");
		list.add("varun");//add(index,object)
		
		//System.out.println(list);
		
		
		Object[]obj=list.toArray();
		
		System.out.println(obj[1]);
		
	}

}
