package sec03;


public class CarExample {

	public static void main(String[] args) {
		
		Sedan sedan1 = new Sedan();
		sedan1.upSpeed(300); // sedan 오버라이딩한 메서드를 호출하고 
		sedan1.seatNum =5;
		
		Truck truck1 = new Truck("Blue", 0, 0);
		truck1.upSpeed(100); // 트럭에서 오버라이딩 되지 않았으므로 기존 Car의 메서드를 호출함 
		truck1.capacity = 50;
		
		System.out.println("Sedan's speed is "+ sedan1.speed +"km, and seatNum is "+ sedan1.getSeatNum());
		System.out.println("Truck's speed is "+ truck1.speed +"km, and color is "+ truck1.getColor() + " and capacity is " + truck1.getCapacity());

	}

}
