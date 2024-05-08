package sec01ClassExtends;

public class Car {	
	
	//필드 
	String color;
	int speed;
	
	//메소드 
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed -value;
	}
}
