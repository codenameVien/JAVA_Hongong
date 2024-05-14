package sec03;

public class Truck extends Car{
	int capacity;

	
	Truck (String color, int speed, int capacity){
		//this.color = color;
		//this.speed = speed;
		super(color, speed); // super 는 this() 처럼 Car에 있는생성자를 부르는역
		this.capacity = capacity;
	}

	int getCapacity() {
		return capacity;
	}


}