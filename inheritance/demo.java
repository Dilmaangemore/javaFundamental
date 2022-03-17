package inheritance;

public class demo {
// make obj of car class to acess
	public static void main(String []args) {
	  car c= new car();
	  c.carModel="AModel";
	  c.carCost=2500000;
	  c.startCar();
	  
	  c.stopCar();
	  benz b= new benz();
	  b.carCost=4500000;
	  b.carModel="Aclass";
	  b.stopCar();
	  b.startCar();
	  b.numberofGears=3;
	  b.opensunRoof();
}
}