package sec02;

class Calc {
	// 메서드의 리턴타입은 상관 없음, 매개변수의 리턴타입이 결정한거임 
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double plus(double x, double y) {
		double result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	double avg(double x, double y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result1 = avg(7, 10);
		double result2 = avg(10.5, 20.3);
		System.out.println("Result: " + result1);
		System.out.println("Result: " + result2);
	}
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		myCalc.execute();
	}
}
