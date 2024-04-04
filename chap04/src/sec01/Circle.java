package sec01;

public class Circle {
	
	int radius; //원의 반지름 필드
	String name; //원의 이름 필드
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		//Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "hotchickenshrimp";
		System.out.println(pizza.name + "'s radius is " + pizza.radius);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "Space Donut";
		System.out.println(donut.name + "'s radius is " + donut.radius);
	}
}
