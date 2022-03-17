package constructor.overloading;

public class car {
// java differntiate constructor with parameter with different type , order, count
	// java allow to different constructor with same name
	public car() {
		this(8);
	System.out.println("without parameterise constructor");	
	}
	public car(int x) {
		// same constructor name with different parameter
		this(3,6);
		System.out.println("single parametrise constructor;"+x);
		
	}
	public car(int x,int y) {
		System.out.println("double parametrise with different order of variable;"+x +" " +y);
		// order of parameter different
	}
	public car(int x, String y) {
		
		
		System.out.println("double parametrise constructor with different datatype;"+x+""+y);
		//having different data type
	}
}
