package ArrayList;
import java.util.ArrayList;
public class setmethod {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("vishnu");
		list.add("singh");
		list.add("pratap");
		
	 String replacesOldObject = list.set(0, "arun");
	 
		System.out.println(list);
		System.out.println("replace with"+replacesOldObject);
		
		
	/*******	//output ;         [arun, singh, pratap]
		                            replace withvishnu              *****************/
	}

}
