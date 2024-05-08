package sec03;

public class Car {
	
	//필드 
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	
	//생성자 (오버로딩)
	Car(){
		
	}
	
	Car(String model){
		this.model = model; // this = 나는 , CarExample 코드에서는 객체 생성하면서 car1라는 이름을 부여 했지만,  여기코드에서는 아직 car1처럼 이름을 받지 못했으므로 "나라는 객체는요!" 라는 의미를 가지고 있음 
		// this(model, null, 0); # 중복된 코드를 this()로 호출
	}
	
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
		//this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxSpeed;
	}
}
