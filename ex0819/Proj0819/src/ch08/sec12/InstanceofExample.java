package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		taxi.run();
		System.out.println();
		ride(bus);
		bus.run();
	}
	
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
	}
}
