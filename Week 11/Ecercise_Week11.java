public class Ecercise_Week11{
  public static void main(String[] args) {
    PoliceCar cars[];
  }


interface IsEmergancy {
	public void soundSiren();
			
}

class PoliceCar implements IsEmergancy,LandVehicle {
	int carID= 1234;
	int DasignatedCop= 666;
	@Override
	public void drive() {
		System.out.print("Time to get those crimenal Scum!");
	}

	@Override
	public void soundSiren() {
		System.out.print("WHE-WHEO-WHEO!1");
		
	}
	public void susArested() {
		System.out.print("A susbected is handcufed in the backseat.");
		
	}
	public void donetSequred() {
		System.out.print("We got our daily box of donots, BOIES!!");
		
	}
	
}
interface Vehicle{
	String name = "";
	int maxPassengers = 4;
	int maxSpeed = 120;
	
}
interface LandVehicle extends Vehicle{
	int numWheels =4;
	public void drive();
}

interface SeaVehicle extends  Vehicle{
	int displacement = 0;
	public void launch();
}

class Jeep implements  LandVehicle{
	public void soundHorn(){
}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}class Hovercraft implements LandVehicle,SeaVehicle{
	public void enterLand(){
}
	public void enterSea(){
	}
	@Override
	public void launch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}
class Frigate implements SeaVehicle{
	public void fireGun(){
}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		
	}
}

}