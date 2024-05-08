package sec01ClassExtends;

public class CarExample {

	public static void main(String[] args) {
		
		Sedan sedan1 = new Sedan();
		sedan1.upSpeed(300); //상속된 필드와 메소드 
		sedan1.seatNum = 5; //상속된 필드와 메소드 
		
		Truck truck1 = new Truck();
		truck1.upSpeed(100); //상속된 필드와 메소드 
		truck1.capacity = 50; //상속된 필드와 메소드 
		
		System.out.println("Speed of sedan is "+ sedan1.speed + "km, and the seat number is " + sedan1.getSeatNum()+".");
		System.out.println("Speed of truck is "+ truck1.speed + "km, and the capacity is " + truck1.getCapacity()+".");

	}

}
