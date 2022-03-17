package constructor.supeR;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super(4,9);// eventhough super() key not added explicitly jvm will create implicitly
		// even we do not add super()first envoke parent class than child classs will be executed
		
		// if we want to envoke parametrize childclass constructor then we must need super with passing parameter value
		
		System.out.println("inside child class");
		
	}
	public ChildClass(int x) {
		//super(4,9);
		System.out.println("inside single paarameter childclass constructor;"+x);
	}
}
