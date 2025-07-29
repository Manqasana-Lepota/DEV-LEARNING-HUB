package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		MountainBike bike = new MountainBike(20, 10, 1);
		
		System.out.println("Gear is: " + bike.getGear());
		System.out.println("Seat height is: " + bike.getSeatHeight());
		System.out.println("Bike speed is: " + bike.getSpeed());
		
		bike.applyBrakes(1);
		System.out.println("Bike speed after applying break is: " + bike.getSpeed());
		
		bike.speedUp(10);
		System.out.println("Bike's new speed after increment is: " + bike.getSpeed());
		
		

	}

}
