package sec03;

public class Truck extends Car{
	int capacity;

	
	Truck (String color, int speed, int capacity){
		//this.color = color;
		//this.speed = speed;
		super(color, speed);
		this.capacity = capacity;
	}

	int getCapacity() {
		return capacity;
	}


}