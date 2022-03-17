package constructor.overloading;

public class demo {
 public static void main(String[]args) {
	 //car obj= new car() ;
	 // here in car class serveral constructor with car() is available
	 // this obj cration is confusing which constructor should call
	 
	 // suppose i want to call second constructor car(int x){}
	 // pass a single parameter 9
	 // it will call a single parameterise constructor
	 
	 
	 car c = new car();
	 
	 //output;
		//single parametrise constructor;9
	 
	 // at same time i want to call constructor having no constructor
	 // add this() in single parameter constructor
	 
 }
}
