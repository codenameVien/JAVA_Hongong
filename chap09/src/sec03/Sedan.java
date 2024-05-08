package sec03;

public class Sedan extends Car{
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	
	
	void setSpeed(int speed) {
		this.speed = this.speed  + speed;
	}
	
	@Override
	// 매개변수 이름은 다르지만 자료형이 같으므로 같은 매개변수 취급 
	void upSpeed(int speed) {
		if(this.speed >200) {
			this.speed = 200;
		}
		System.out.println("현재속도(Sedan, 자식 클래스) " + this.speed);
	}
}
