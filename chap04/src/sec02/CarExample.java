package sec02;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("present speed : "+ speed + "km/h");

	}
}
