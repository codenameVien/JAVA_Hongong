package sec02;

class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius; // 해당 객체의 radius(파랑 필드)값에는 radius(검정 매개변수) 값이 할당됨 
	}
	
	public double getArea() {
		return 3.14 * radius * radius; //필드 * 필드 (반지름의 값을 이용하여 원의 넓이 계산) 
	}

}


public class ReferencePassing {
	public static void main(String[] args) {
		Circle pizza = new Circle(9); //피자라는 이름의 Circle객체 생성 후 피자의 필드에는 매개변수인 9가 할당됨	
	
		increase(pizza); // 현재 클래스의 메소드를 사용하므로 걍 사용해도 됨 
        //반지름이 10이 됨

		System.out.println(pizza.radius); //10
		
		double area = pizza.getArea(); //외부 클래스의 메소드를 불러오는 거이므로 pizza.메소드 
        								// 피자 객체의 getArea메서드를 호출하여 넓이 계산
        								// area = 3.14 * 10 * 10
		System.out.println(area); // 314.0
		

} //main 함수의 끝 
	
	
		static void increase(Circle m) {
			m.radius++; 
		
	}
}
